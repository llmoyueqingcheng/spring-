package com.mocheng.spring.mytest;

import com.mocheng.spring.Bean.User;
import com.mocheng.spring.config.myConfig;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author ls
 * @date 2021年03月14日 5:41 下午
 */
@Component
public class mainTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext contest = new AnnotationConfigApplicationContext(myConfig.class);
        User user = (User) contest.getBean("User");

        System.out.println(user.getName());
    }
}
