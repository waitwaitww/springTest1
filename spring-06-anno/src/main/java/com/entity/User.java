package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id=“User” class = "com.entity.User"/>
//Component 组件
@Component
//@Scope("singleton") //定义作用域
public class User {
    //相当于<property name = "name" value = "wwy"/>
    @Value("wwy")
    public String  name ;
    //@Value("wwy")
    public void setName(String name) {
        this.name = name;
    }
}
