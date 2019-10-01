package com.zdd.spring.ImportAware;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

	String value() default "test";
}
