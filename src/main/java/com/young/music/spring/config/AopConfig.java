package com.young.music.spring.config;

import com.young.music.spring.bean.A;
import com.young.music.spring.bean.LogAspect;
import com.young.music.spring.bean.MathCal;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author yzx
 * create_time 2020/5/11
 */
@Configuration
@EnableAspectJAutoProxy
// @EnableAsync
@Import({LogAspect.class, MathCal.class/*,A.class*/})
public class AopConfig {

}
