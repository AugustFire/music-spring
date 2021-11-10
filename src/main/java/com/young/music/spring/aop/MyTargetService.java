package com.young.music.spring.aop;

/**
 * 123
 *
 * @author Zongxu.Yang
 * @since 2021/4/25 14:50
 */
public class MyTargetService {
    @Override
    public String toString() {
        System.out.println("toString invoke!");
        return "MyTargetService{}";
    }

    public void testAop() {
        System.out.println("testAop invoke!");
    }
}
