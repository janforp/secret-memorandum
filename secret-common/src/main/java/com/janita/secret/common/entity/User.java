package com.janita.secret.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Janita on 2017/6/11- 15:40
 * 该类是:用户
 */
@Data
@Entity
@Table(name = "user",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"mobilePhone"}),
        @UniqueConstraint(columnNames = {"email"})
})
public class User implements Serializable{

    @Id
    private String userId;

    //手机,用于登录
    private String mobilePhone;

    //MD5
    private String password;

    //昵称
    private String nickname;

    //邮箱,可用于登录
    private String email;

    //性别,0:女,1:男,默认为 1
    @Column(name = "gender", columnDefinition = "tinyint default 1")
    private int gender = 1;

    //头像
    private String icon;

    //账户状态,0:正常普通用户,1:会员,2:开发人员,3:黑名单,默认是 0
    private int accountStatus;

    //余额
    private BigDecimal balance ;

    //注册时间
    private Long registerTime;

    //修改时间
    private Long updateTime;

}
