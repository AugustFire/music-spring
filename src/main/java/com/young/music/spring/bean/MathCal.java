package com.young.music.spring.bean;

/**
 * @author yzx
 * create_time 2020/5/11
 */
public class MathCal implements MathCalI{


    @Override
    public int div(int i, int j) {
        return i/j;
    }
    @Override
    public int sum(int i, int j) {
        return 0;
    }
}
