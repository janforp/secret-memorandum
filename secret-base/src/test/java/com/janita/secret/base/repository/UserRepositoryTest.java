package com.janita.secret.base.repository;

import com.janita.secret.common.domain.base.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by Janita on 2017/6/11- 21:07
 * 该类是:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByMobilePhone() throws Exception {

        User user = userRepository.findByMobilePhone("137");
        System.out.println("\n****************** " + user);
    }

}
