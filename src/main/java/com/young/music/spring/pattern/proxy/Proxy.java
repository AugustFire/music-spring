package com.young.music.spring.pattern.proxy;

/**
 * @author yzx
 * create_time 2020/6/10
 */
public class Proxy implements ProxyI{


    private final ProxyTarget proxyTarget;

    public Proxy(ProxyTarget proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void searchSomeOne() {
        System.out.println("begin!");
        proxyTarget.searchSomeOne();
        System.out.println("End!");
    }
}
