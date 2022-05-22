package com.config;

import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //也会被spring接管，被注册到ioc容器中，因为它本来就是一个@Component
//@Configuration 代表这是一个配置类，就和之前的beans.xml相同
@ComponentScan("com")
@Import(MyConfig2.class)
public class MyConfig {
    //注册一个bean，就相当于之前写的一个bean标签
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值就相当于bean标签当中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要接入到bean的对象
    }
}
