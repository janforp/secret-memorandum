package com.janita.secret.common.service;


import com.janita.secret.common.entity.User;

/**
 * Created by Janita on 2017/6/11- 15:40
 * 该类是:用户接口
 */
public interface IUserService {

    /**
     * 用户注册
     * @param mobilePhone   手机号码
     * @param password  密码
     * @param nickname  昵称
     * @param email 邮箱
     * @param gender    性别
     * @param icon  头像
     */
    void register(String mobilePhone, String password, String nickname, String email, int gender, String icon);

    /**
     * 登录
     * @param mobilePhone   手机
     * @param password  密码
     */
    void login(String mobilePhone, String password);

    User createUser(User user);
}
