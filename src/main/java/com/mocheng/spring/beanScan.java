package com.mocheng.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author ls
 * @date 2021年03月14日 9:58 下午
 */
@Configuration
//@ComponentScan(value="com.mocheng",excludeFilters={@ComponentScan.Filter(type = FilterType.ANNOTATION ,classes = {DataSourceAutoConfiguration.class}) })
@ComponentScan(value="com.mocheng")
public class beanScan {




}
