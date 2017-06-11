package com.janita.secret.common.service.base;

import com.janita.secret.common.domain.base.VerifyCode;

/**
 * Created by Janita on 2017/6/11- 21:28
 * 该类是:手机验证码
 */
public interface IVerifyCodeService {

    VerifyCode sendVerifyCode(VerifyCode verifyCode);

    VerifyCode createVerifyCode(VerifyCode verifyCode);

    VerifyCode lastCode(String mobilePhone);

    VerifyCode updateById(VerifyCode oldCode);
}
