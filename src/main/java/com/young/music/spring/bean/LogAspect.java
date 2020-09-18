package com.young.music.spring.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 日至切面
 *
 * @author yzx
 * create_time 2020/5/11
 */
@Aspect
public class LogAspect {

    @Before("execution(public int com.young.music.spring.bean.MathCal.*(..))")
    public void logStart() {
        System.out.println("除法开始!");
    }
}
