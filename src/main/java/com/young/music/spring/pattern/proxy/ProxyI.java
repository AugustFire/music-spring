package com.young.music.spring.pattern.proxy;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;

/**
 * @author yzx
 * create_time 2020/6/10
 */
public interface ProxyI {

    @Scope(value = "singleton")
    void searchSomeOne();

}
