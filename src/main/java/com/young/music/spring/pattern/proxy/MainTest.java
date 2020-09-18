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
        // ProxyTarget proxyTarget = new ProxyTarget();
        // Proxy proxy = new Proxy(proxyTarget);
        // proxy.searchSomeOne();

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        ProxyI proxyI = (ProxyI) java.lang.reflect.Proxy.newProxyInstance(contextClassLoader,
                // ProxyI.class,
                new Class[]{ProxyI.class},
                (proxy, method, args1) -> {
                    Scope annotation = method.getAnnotation(Scope.class);
                    String value = annotation.value();
                    System.out.println(value);
                    return null;
                });
        proxyI.searchSomeOne();

    }
}
