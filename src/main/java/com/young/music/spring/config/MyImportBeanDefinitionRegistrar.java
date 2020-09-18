package com.young.music.spring.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * create_time 2020/1/19
 *
 * @author yzx
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param annotationMetadata 当前类的注解信息
     * @param registry           bean定义的注册类
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
//        registry.containsBeanDefinition();
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(HelloController.class);
        registry.registerBeanDefinition("helloController",rootBeanDefinition);

    }
}
