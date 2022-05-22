package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class People {
    //@autowire通过byType实现，而且必须要求这个对象存在
    //
    //@resource默认通过byName实现，如果找不到，通过byType实现
    //required 为 flase 说明这个对象可以为空，否则不允许为空（@Nullable）
    @Autowired(required = false)
    private Dog dog;
    @Autowired
    @Qualifier(value = "Cat")
    private Cat cat;
    private String name;

    public People() {
    }

    public People(@Nullable String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
