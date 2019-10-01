package com.zdd.spring.factorymethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		//可以看到拿到的是工厂方法返回的bean对象
		RealDao testDao = (RealDao) annotationConfigApplicationContext.getBean("testDao");

		testDao.test();
		// RealDao
	}
}
