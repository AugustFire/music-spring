package com.young.music.spring;

import com.young.music.spring.bean.MathCalI;
import com.young.music.spring.config.AopConfig;
import com.young.music.spring.config.BeanLifeCycleConfig;
import com.young.music.spring.config.JavaConfig;
import com.young.music.spring.config.TxConfig;
import com.young.music.spring.config.importaware.ConfigurationOne;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * create_time 2020/1/16
 *
 * @author yzx
 */
@SuppressWarnings("all")
public class MainApplication {

    /**
     * 测试Bean的注入
     *
     * @param args
     */
    @Test
    public void importTest() {

       // ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person.getName()+"你好!");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Object helloFactoryBean = applicationContext.getBean("helloFactoryBean");
        System.out.println("__");
        System.out.println(helloFactoryBean.getClass());
    }

    @Test
    public void importAwareTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationOne.class);
    }

    /**
     * 测试Bean的生命周期
     */
    @Test
    public void beanLifeCycleTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ac.close();
    }

    /**
     * spring aop 测试
     */
    @Test
    public void aopTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);
        MathCalI mathCal = ac.getBean(MathCalI.class);
        int div = mathCal.div(1, 1);
        System.out.println(div);
        ac.close();
    }


    /**
     * spring tx 测试
     */
    @Test
    public void txTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TxConfig.class);
        // UserService bean = ac.getBean(UserService.class);
        // bean.insertUser();

        System.out.println("----->");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ac.close();
    }

    @Test
    public void s() {
        System.out.println(System.currentTimeMillis());
        String as = null;
        System.out.println(as.toString());
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"de");
        }

    }
}
