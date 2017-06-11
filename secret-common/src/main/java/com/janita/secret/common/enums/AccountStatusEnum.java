package com.janita.secret.common.enums;

/**
 * Created by Janita on 2017/6/11- 15:52
 * 该类是:
 */
public enum AccountStatusEnum {

    COMMON_USER("普通用户", 0),

    VIP_MEMBER("会员", 1),

    DEVELOPER("开发人员", 2),

    BLACK_MEMBER("黑名单人员", 3);

    private String statusName;

    private int statusCode;

    private AccountStatusEnum(String statusName, int statusCode) {
        this.statusName = statusName;
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
