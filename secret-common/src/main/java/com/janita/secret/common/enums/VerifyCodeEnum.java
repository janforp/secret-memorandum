package com.janita.secret.common.enums;

/**
 * Created by Janita on 2017/6/11- 15:52
 * 该类是:手机验证码状态
 * 验证状态, 0:未验证,1:验证通过,2:验证未通过,3:验证码失效
 */
public enum VerifyCodeEnum {

    NOT_VERIFY("未验证", 0),

    PASS("验证通过", 1),

    NOT_PASS("验证未通过", 2),

    CODE_OVERTIME("验证码超时", 3);

    private String name;

    private int code;

    private VerifyCodeEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
