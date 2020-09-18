package com.young.music.spring.pattern.proxy;

/**
 * @author yzx
 * create_time 2020/6/10
 */
public class ProxyTarget implements ProxyI{
    @Override
    public void searchSomeOne() {
        System.out.println("I am target! I want you!");
    }
}
