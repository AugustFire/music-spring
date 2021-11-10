package com.young.music.spring.config;

import com.young.music.spring.bean.Person;
import com.young.music.spring.config.importaware.EnableSomeConfiguration;
import org.springframework.context.annotation.*;

/**
 *
 *
 * create_time 2020/1/16
 *
 * @author yzx
 */
@Configuration
//@ComponentScan
//@Import(HelloController.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
public class JavaConfig {




    /**
     * 给容器返回一个Bean,类型为返回值的类型,Id默认是方法名(默认和bean name相同)
     *
     * @return person
     */
    @Bean("person1")    //指定name
    //@Lazy             //延迟加载
    @Conditional({})
    public Person person1() {
        return new Person("le", 13);
    }

    @Bean("person2")    //指定name
    public Person person2() {
        return new Person("ti", 14);
    }

    @Bean
    public HelloFactoryBean helloFactoryBean() {
        return new HelloFactoryBean();
    }



    /**
     * 注册bean的方法
     * 1.@ComponentScan + @Component
     * 2.@Bean
     * 3.@Import
     *      (1).Import(Bean.class)
     *      (1).Import(MyImportSelector.class)
     *      (1).Import(MyImportBeanDefinitionRegistrar.class)
     * 4.使用Spring提供的FactoryBean(工厂Bean)
     *      Note:获取到的对象是*FactoryBean.getObject()*创建的对象;如果要获取FactoryBean本身,则加&符号
     *
     */
    @SuppressWarnings("unused")
    public void readme() {

    }
}
