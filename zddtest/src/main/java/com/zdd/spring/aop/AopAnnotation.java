package com.zdd.spring.aop;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Import(AopImportSelector.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface AopAnnotation {
}
