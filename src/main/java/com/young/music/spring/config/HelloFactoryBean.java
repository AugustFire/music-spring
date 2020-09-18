package com.young.music.spring.config;

import org.springframework.beans.factory.FactoryBean;

/**
 * 创建一个Spring定义的FactoryBean
 * create_time 2020/1/19
 *
 * @author yzx
 */
public class HelloFactoryBean implements FactoryBean<HelloController> {

    public HelloController getObject() {
        System.out.println("HelloFactoryBean getObject ...");
        return new HelloController();
    }

    public Class<?> getObjectType() {
        return HelloController.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
