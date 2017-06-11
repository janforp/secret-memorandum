package com.janita.secret.base.service;

import com.janita.secret.base.repository.VerifyCodeRepository;
import com.janita.secret.common.domain.base.VerifyCode;
import com.janita.secret.common.service.base.IVerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017/6/11- 21:29
 * 该类是:手机验证码
 */
@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {

    private final VerifyCodeRepository verifyCodeRepository;

    @Autowired
    public VerifyCodeServiceImpl(VerifyCodeRepository verifyCodeRepository) {
        this.verifyCodeRepository = verifyCodeRepository;
    }

    /**
     * 发送验证码到手机
     * @param verifyCode
     * @return  验证码对象
     */
    @Override
    public VerifyCode sendVerifyCode(VerifyCode verifyCode) {

        //TODO,此处需要发送短信验证码
        return verifyCode;
    }

    /**
     * 生成验证码
     * @param verifyCode
     * @return
     */
    @Override
    public VerifyCode createVerifyCode(VerifyCode verifyCode) {
        return verifyCodeRepository.save(verifyCode);
    }

    /**
     * 该手机的上一次的验证码
     * @param mobilePhone
     * @return
     */
    @Override
    public VerifyCode lastCode(String mobilePhone) {
        return verifyCodeRepository.findByMobilePhone(mobilePhone);
    }

    @Override
    public VerifyCode updateById(VerifyCode oldCode) {
        return verifyCodeRepository.updateByCodeId(oldCode);
    }
}
