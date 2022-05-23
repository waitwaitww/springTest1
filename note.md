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

@Nullable //字段标志的注解，说明这个字段可以为null

@Component //组件，放在类上，说明这个类被spring管理了就是bean！
//dao （@Repository）
//service（@Service）
//controller（@Controller）

@Value//将类的属性注入值，放在属性之上或者set接口之上

@Scope //定义作用域
@Scope("singleton")

@ComponentScan("com")//等价于<context:component-scan base-package="com"/>

@Import(Config2.class)//等价于<import resource="Beans.xml"/>

@Configuration //也会被spring接管，被注册到ioc容器中，因为它本来就是一个@Component
//@Configuration 代表这是一个配置类，就和之前的beans.xml相同

//注册一个bean，就相当于之前写的一个bean标签
//这个方法的名字就相当于bean标签中的id属性
//这个方法的返回值就相当于bean标签当中的class属性
@Bean

```