package com.young.music.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * create_time 2020/1/16
 *
 * @author yzx
 */
public class Person implements InitializingBean, DisposableBean, ApplicationContextAware {

    private String name;

    private Integer age;

    //3
    @PostConstruct
    public void postC() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preD() {
        System.out.println("PreDestroy");
    }

    //4
    public void init() {
        System.out.println("person birth");
    }

    public void destroyM() {
        System.out.println("person destroyM");
    }

    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet:" + this.name);
    }

    public void destroy() {
        System.out.println("person destroy");
    }


    public Person() {
        System.out.println("person constructor");
    }

    //order 1
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("constructor params 2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware setApplicationContext"+applicationContext);
    }
}
