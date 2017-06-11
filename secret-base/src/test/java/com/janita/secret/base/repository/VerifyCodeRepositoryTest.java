package com.janita.secret.base.repository;

import com.janita.secret.common.domain.base.VerifyCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by Janita on 2017/6/11- 22:41
 * 该类是:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class VerifyCodeRepositoryTest {

    @Autowired
    private VerifyCodeRepository verifyCodeRepository;

    @Test
    public void findByMobilePhone() throws Exception {
    }

    @Test
    public void updateById() throws Exception {

        VerifyCode code = verifyCodeRepository.findByMobilePhone("137");

        System.out.println("\n****************** " + code);
    }
}
