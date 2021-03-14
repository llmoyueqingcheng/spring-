package com.mocheng.spring.config;

import com.mocheng.spring.Bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ls
 * @date 2021年03月14日 5:32 下午
 */
@Configuration
public class myConfig {

    @Bean
    public User User(){
        return new User("lisi","33");
    }
}
