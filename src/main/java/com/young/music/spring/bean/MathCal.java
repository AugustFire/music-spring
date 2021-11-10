package com.young.music.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

/**
 * @author yzx
 * create_time 2020/5/11
 */
public class MathCal implements MathCalI{
    //
    // @Autowired
    // private A a;

    @Override
    @Async
    public int div(int i, int j) {
        return i/j;
    }
    @Override
    public int sum(int i, int j) {
        return 0;
    }
}
