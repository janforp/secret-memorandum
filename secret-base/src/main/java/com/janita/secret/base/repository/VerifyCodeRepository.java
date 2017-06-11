package com.janita.secret.base.repository;

import com.janita.secret.common.domain.base.VerifyCode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Janita on 2017/6/11- 21:30
 * 该类是:手机验证码
 */
public interface VerifyCodeRepository extends JpaRepository<VerifyCode, String> {

    VerifyCode findByMobilePhone(String mobilePhone);

    VerifyCode updateByCodeId(VerifyCode oldCode);
}
