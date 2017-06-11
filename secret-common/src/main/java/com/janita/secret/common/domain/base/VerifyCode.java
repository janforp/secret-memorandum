package com.janita.secret.common.domain.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Janita on 2017/6/11- 21:17
 * 该类是:手机验证码
 */
@Entity
@Data
public class VerifyCode implements Serializable {

    @Id
    private String codeId;

    @Column(length = 20, nullable = false, unique = true)
    private String mobilePhone;

    @Column(length = 4, nullable = false)
    private String code;

    //验证状态, 0:未验证,1:验证通过,2:验证未通过,3:验证码失效
    private int verifyStatus = 0;

    //发送验证码码次数
    private int sendTimes;

    //验证码发送时间戳
    private long sendTime = 0;

    //验证时间
    private Long verifyTime;
}
