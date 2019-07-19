package com.kwonyoon.springexample.config;

import org.springframework.context.annotation.Bean;
import com.kwonyoon.springexample.redis.PointDao;;

public class DaoConfig {
    @Bean
    public PointDao pointDao() {
        return new PointDao();
    }
}