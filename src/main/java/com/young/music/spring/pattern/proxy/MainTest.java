package com.young.music.spring.pattern.proxy;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.springframework.context.annotation.Scope;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yzx
 * create_time 2020/6/10
 */
public class MainTest {

    public static void main(String[] args) {


        ProxyI real = () -> "real";
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        ProxyI proxyI = (ProxyI) java.lang.reflect.Proxy.newProxyInstance(contextClassLoader,
                new Class[]{ProxyI.class},
                (proxy, method, args1) -> {
                    Scope annotation = method.getAnnotation(Scope.class);
                    String value = annotation.value();
                    System.out.println(value);
                    Object invoke = method.invoke(real,args1);

                    return invoke.toString()+"dynamic";
                });
        String s = proxyI.searchSomeOne();
        System.out.println(s);
    }
}
