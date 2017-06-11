package com.janita.secret.common.enums;

/**
 * Created by Janita on 2017/6/11- 15:52
 * 该类是: 账户金钱发生变化时
 * 用于记录是充值还是提现,或者其他情况
 */
public enum MoneyStatusEnum {

    RECHARGE("充值", 0),

    WITHDRAW("提现", 1);

    private String statusName;

    private int statusCode;

    private MoneyStatusEnum(String statusName, int statusCode) {
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
