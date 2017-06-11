package com.janita.secret.base.service;

import com.janita.secret.base.repository.UserRepository;
import com.janita.secret.common.domain.base.User;
import com.janita.secret.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017/6/11- 16:50
 * 该类是:
 */
@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 根据手机号码查询用户
     * @param mobilePhone   手机号码
     * @return  用户
     */
    @Override
    public User findByMobilePhone(String mobilePhone) {
        return userRepository.findByMobilePhone(mobilePhone);
    }
}
