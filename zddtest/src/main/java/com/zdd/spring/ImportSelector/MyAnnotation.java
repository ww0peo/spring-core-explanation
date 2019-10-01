package com.zdd.spring.ImportSelector;

import com.zdd.spring.ImportSelector.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//这个注解会在运行时起作用
@Retention(RetentionPolicy.RUNTIME)
//注入ImportSelector的实现类
@Import(MyImportSelector.class)
public @interface MyAnnotation {

}
