package com.young.music.spring.config;


import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * create_time 2020/1/19
 *
 * @author yzx
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //返回要导入的组件的全限定名的数组
        return new String[]{"com.young.music.spring.config.HelloController"};
    }
}
