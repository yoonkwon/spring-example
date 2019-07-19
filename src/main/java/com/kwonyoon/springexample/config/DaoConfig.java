package com.kwonyoon.springexample.config;

import org.springframework.context.annotation.Bean;
import com.kwonyoon.springexample.redis.PointDao;
import org.springframework.context.annotation.Configuration;;

@Configuration
public class DaoConfig {
    @Bean
    public PointDao pointDao() {
        return new PointDao();
    }
}