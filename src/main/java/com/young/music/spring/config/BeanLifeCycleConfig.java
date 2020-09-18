package com.young.music.spring.config;

import com.young.music.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * create_time 2020/1/19
 *
 * @author yzx
 */
@Configuration
@Import(MyBeanPostProcessor.class)
public class BeanLifeCycleConfig {

    @Bean(initMethod = "init",destroyMethod = "destroyM")
    public Person person() {
        return new Person("Tom", 19);
    }
}
