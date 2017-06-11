package com.janita.secret.base.controller;

import com.janita.secret.base.util.BaseUtils;
import com.janita.secret.common.domain.base.User;
import com.janita.secret.common.domain.base.VerifyCode;
import com.janita.secret.common.enums.ResultEnum;
import com.janita.secret.common.enums.VerifyCodeEnum;
import com.janita.secret.common.result.ResultDto;
import com.janita.secret.common.result.ResultDtoFactory;
import com.janita.secret.common.service.IUserService;
import com.janita.secret.common.service.base.IVerifyCodeService;
import com.janita.secret.common.util.CommonUtils;
import com.janita.secret.common.util.TimeUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017/6/11- 16:48
 * 该类是:
 */
@RestController
@RequestMapping(value = "/user")
@Api(value = "用户注册,登录接口")
public class RegisterLoginController {

    private final IUserService userService;
    private final IVerifyCodeService verifyCodeService;

    @Autowired
    public RegisterLoginController(IUserService userService, IVerifyCodeService verifyCodeService) {
        this.userService = userService;
        this.verifyCodeService = verifyCodeService;
    }

    /**
     * 用户注册第一步:发送验证码
     * @param mobilePhone   手机
     * @return  发送成功或失败
     */
    @GetMapping("/sendCode")
    public ResultDto sendResisterCode(@RequestParam String mobilePhone) {
        //1.手机号码没有注册
        User user = userService.findByMobilePhone(mobilePhone);
        if (user != null) {
            return ResultDtoFactory.toError(ResultEnum.PHONE_REGISTERED);
        }
        //2.看该手机上一次的验证码
        VerifyCode oldCode = verifyCodeService.lastCode(mobilePhone);
        if (oldCode == null) {
            //该手机的第一次验证码,则可以发送验证码到该手机
            VerifyCode newCode = new VerifyCode();
            newCode.setCode(BaseUtils.getRandomVerifyCode());
            newCode.setMobilePhone(mobilePhone);
            newCode.setVerifyStatus(VerifyCodeEnum.NOT_VERIFY.getCode());
            newCode.setSendTimes(1);
            newCode.setSendTime(CommonUtils.currentTime());
            verifyCodeService.createVerifyCode(newCode);
        }else {
            //若不是第一次,则分情况
            //1.看上一次的发送时间是否是今天之前的
            long sendTime = oldCode.getSendTime();
            if (sendTime < TimeUtils.get000Timestamp(CommonUtils.currentTime())) {
                //若上一次发送时间在进入0点之前,则今日次数是0
                oldCode.setCode(BaseUtils.getRandomVerifyCode());
                oldCode.setMobilePhone(mobilePhone);
                oldCode.setVerifyStatus(VerifyCodeEnum.NOT_VERIFY.getCode());
                oldCode.setSendTimes(1);
                oldCode.setSendTime(CommonUtils.currentTime());
                oldCode.setVerifyTime(null);
                verifyCodeService.updateById(oldCode);
            }else {
                //若上一次发送的时间在今日,则需要看总次数是否超过5次
            }
        }

        return ResultDtoFactory.toSuccess();
    }

}