package com.young.music.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 定义一个环绕通知
 *
 * @author Zongxu.Yang
 * @since 2021/4/25 14:44
 */
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("aroundAdvice invoked");
        return invocation.proceed();
    }
}
