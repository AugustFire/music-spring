package com.young.music.spring.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 定义一个后置通知
 * @author Zongxu.Yang
 * @since 2021/4/25 14:42
 */
public class MyAfterReturnAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("after invoke method [" + method.getName() + "],aop afterReturning logic invoked");
    }
}
