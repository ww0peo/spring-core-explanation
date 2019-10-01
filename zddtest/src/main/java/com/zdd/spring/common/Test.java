package com.zdd.spring.common;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(SpringConfig.class);
		annotationConfigApplicationContext.refresh();
	}
}
