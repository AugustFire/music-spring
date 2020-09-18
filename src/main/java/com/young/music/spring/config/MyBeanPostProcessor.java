package com.young.music.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * Bean后置处理器
 * create_time 2020/1/19
 *
 * @author yzx
 */

public class MyBeanPostProcessor implements BeanPostProcessor {

    //order 2
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            System.out.println("postProcessBeforeInitialization_" + beanName + "____" + bean);
        }
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            System.out.println("postProcessAfterInitialization_" + beanName + "____" + bean);
        }
        return bean;
    }
}
