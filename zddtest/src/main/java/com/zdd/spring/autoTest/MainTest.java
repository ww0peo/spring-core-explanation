package com.zdd.spring.autoTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		TestService testService = (TestService) annotationConfigApplicationContext.getBean("testService");
		testService.selectTest("A");
	}
}
