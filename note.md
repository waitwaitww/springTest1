##常用依赖：
```xml
<dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>5.2.9.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>5.2.9.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
```
## xml框架
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">  
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions go here -->

</beans>
```

## 获取context
```java
ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
```

##命名空间
```xml
<!-- p -->

xmlns:p="http://www.springframework.org/schema/p"
<!-- c -->
xmlns:c="http://www.springframework.org/schema/c"

```

##启用注解
```xml
 <?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

##常用注解：
```java
@Autowired //在属性之上使用（自动装配）通过bytype实现

@resource //在属性之上使用（自动装配）（Java自带，不用导入spring）通过byname
            //实现，如果如果找不到，通过byType实现
@resource(name = "XXX")

@Qualifier//和@Autowired配和使用，两者结合类似于@resource
@Autowired
@Qualifier(value = "dog");
```