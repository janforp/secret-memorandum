package com.janita.secret.base.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Janita on 2017/6/11- 17:14
 * 该类是:
 */
@EnableJpaRepositories(basePackages = "com.janita.secret.base.repository")
@EntityScan(basePackages = "com.janita.secret.common.domain")
@Configuration
public class JpaConfig {
}
