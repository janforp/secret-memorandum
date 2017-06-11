package com.janita.secret.common.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Janita on 2017/6/11- 16:08
 * 该类是:账户详情
 */
@Data
public class UserAccountDetail implements Serializable {

    private String detailId;

    private String userId;

    private BigDecimal money;

    //状态,0:充值,1:提现,....
    private int moneyStatus;

    private long createTime;
}
