package com.janita.secret.common.service;


import com.janita.secret.common.domain.base.User;

/**
 * Created by Janita on 2017/6/11- 15:40
 * 该类是:用户接口
 */
public interface IUserService {

    /**
     * 根据手机号码查询用户
     * @param mobilePhone   手机号码
     * @return  用户
     */
    User findByMobilePhone(String mobilePhone);
}
