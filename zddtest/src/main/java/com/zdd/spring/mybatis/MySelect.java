package com.zdd.spring.mybatis;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySelect {

	public String value();
}
