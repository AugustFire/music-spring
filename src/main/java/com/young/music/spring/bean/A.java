package com.young.music.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zongxu.Yang
 * create at 2021/4/12
 */
@Component
public class A {
    public A() {
        System.out.println("A Construct");
    }

    @Autowired
    private MathCalI mathCalI;
}
