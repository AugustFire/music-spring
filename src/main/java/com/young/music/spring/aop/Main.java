package com.young.music.spring.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * main
 *
 * @author Zongxu.Yang
 * @since 2021/4/25 14:51
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new MyPointCut(),new MyBeforeAdvice());
        DefaultPointcutAdvisor advisor1 = new DefaultPointcutAdvisor(new MyPointCut(),new MyAfterReturnAdvice());
        DefaultPointcutAdvisor advisor2 = new DefaultPointcutAdvisor(new MyPointCut(),new MyAroundAdvice());
        proxyFactory.addAdvisor(advisor);
        proxyFactory.addAdvisor(advisor1);
        proxyFactory.addAdvisor(advisor2);


        // proxyFactory.addAdvice(new MyAfterReturnAdvice());
        // proxyFactory.addAdvice(new MyAroundAdvice());
        // proxyFactory.addAdvice(new MyBeforeAdvice());
        // proxyFactory.addAdvice(new MyIntroductionAdvice());

        proxyFactory.setTarget(new MyTargetService());

        Object proxy = proxyFactory.getProxy();

        proxy.toString();

        System.out.println("------------------------------------------------------");

        // if (proxy instanceof MyTargetService) {
        //     ((MyTargetService) proxy).testAop();
        // }
        //
        // if (proxy instanceof Runnable) {
        //     ((Runnable) proxy).run();
        // }

    }
}
