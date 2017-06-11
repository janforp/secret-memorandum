package com.janita.secret.base.service;

import com.janita.secret.base.repository.UserRepository;
import com.janita.secret.common.entity.User;
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

    @Override
    public void register(String mobilePhone, String password, String nickname, String email, int gender, String icon) {

    }

    @Override
    public void login(String mobilePhone, String password) {

    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
