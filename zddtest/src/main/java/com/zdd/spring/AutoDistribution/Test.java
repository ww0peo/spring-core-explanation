package com.zdd.spring.AutoDistribution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		AutoTest1 autoTest1 = annotationConfigApplicationContext.getBean(AutoTest1.class);
		AutoTest2 autoTest2 = annotationConfigApplicationContext.getBean(AutoTest2.class);
		/**
		 * 如果什么都没设置那么spring的自动装配的模式是no
		 * 自然就得不到对象中的属性
		 */
		System.out.println("autoTest1&&AutoTest2===========>"+autoTest1.getAutoTest2());
		System.out.println("autoTest2&&AutoTest1===========>"+autoTest2.getAutoTest1());
	}
}
