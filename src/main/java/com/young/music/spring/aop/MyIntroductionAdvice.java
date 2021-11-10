package com.young.music.spring.aop;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * 引入通知
 *
 * @author Zongxu.Yang
 * @since 2021/4/25 14:47
 */
public class MyIntroductionAdvice extends DelegatingIntroductionInterceptor implements Runnable {
    @Override
    public void run() {
        System.out.println("running!!!!");
    }
}
