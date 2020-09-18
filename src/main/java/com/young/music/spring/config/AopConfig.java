package com.young.music.spring.config;

import com.young.music.spring.bean.LogAspect;
import com.young.music.spring.bean.MathCal;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author yzx
 * create_time 2020/5/11
 */
@Configuration
@EnableAspectJAutoProxy
@Import({LogAspect.class, MathCal.class})
public class AopConfig {

}
