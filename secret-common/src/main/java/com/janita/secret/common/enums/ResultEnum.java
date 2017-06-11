package com.janita.secret.common.enums;

/**
 * Created by Janita on 2017/6/11- 15:16
 * 该类是:统一返回的业务错误/异常
 */
public enum ResultEnum {

    UNKNOWN_ERROR(-1, "未知错误"),

    INTERNAL_WRONG(1, "内部错误"),

    PHONE_REGISTERED(2, "该手机号码已经注册,可直接登录");

    private int code;

    private String message;


    private ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
