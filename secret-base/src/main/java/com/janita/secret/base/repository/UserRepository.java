package com.janita.secret.base.repository;

import com.janita.secret.common.domain.base.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Janita on 2017/6/11- 16:45
 * 该类是:
 */
public interface UserRepository extends JpaRepository<User, String>{

    /**
     * 根据手机号码查询用户
     * @param mobilePhone   手机号码
     * @return  用户
     */
    User findByMobilePhone(String mobilePhone);
}
