package com.mocheng.spring.mytest;

import com.mocheng.spring.Bean.User;
import com.mocheng.spring.beanScan;
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
        //Configuration +bean方式注入
        AnnotationConfigApplicationContext contest = new AnnotationConfigApplicationContext(myConfig.class);
        User user = (User) contest.getBean("myUser");
        String[] beanDefinitionNames = contest.getBeanDefinitionNames();
        for (String name: beanDefinitionNames) {
            System.out.println(name);

        }
    }

    @Test
    public void test02(){
        //使用注解方式
        AnnotationConfigApplicationContext contest = new AnnotationConfigApplicationContext(beanScan.class);
        String[] beanDefinitionNames = contest.getBeanDefinitionNames();
        for (String name: beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
