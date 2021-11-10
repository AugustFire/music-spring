package com.young.music.spring.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Zongxu.Yang
 * @since 2021/4/25 14:46
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before invoke method [" + method.getName() + "],aop before logic invoked");
    }
}
