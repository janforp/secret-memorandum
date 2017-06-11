package com.janita.secret.base.controller;

import com.janita.secret.common.entity.User;
import com.janita.secret.common.result.ResultDto;
import com.janita.secret.common.result.ResultDtoFactory;
import com.janita.secret.common.service.IUserService;
import com.janita.secret.common.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by Janita on 2017/6/11- 16:48
 * 该类是:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/create")
    public ResultDto createUser(@RequestBody User user) {
        user.setUserId(CommonUtils.produceUUID());
        user.setBalance(new BigDecimal(0));
        user.setRegisterTime(CommonUtils.currentTime());
        user.setUpdateTime(CommonUtils.currentTime());
        userService.createUser(user);
        return ResultDtoFactory.toSuccess(user);
    }
}
