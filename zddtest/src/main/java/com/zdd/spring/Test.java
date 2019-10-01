package com.zdd.spring;

import com.zdd.spring.ImportSelector.TestImportSelectorBean;
import com.zdd.spring.mybatis.MyDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		/**
		 * spring初始化的三大步骤及顺序
		 *
		 * 1.AnnotationConfigApplicationContext或ClassPathXmlApplicationContext的构造方法
		 * 2.spring上下文对象的register方法
		 * 3.spring上下文对象的refresh方法
		 *
		 */
		//采用注解配置和javaconfig，开启注解
		//初始化了reader和scanner两个对象
		//调用了父类GenericApplicationContext的构造方法将bean工厂给实例化出来
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		//spring认为的使用者自定义的BeanFactoryPostProcessor
		//annotationConfigApplicationContext.addBeanFactoryPostProcessor();

		//通过register这个方法可以直接注册一个对象（bd）到spring容器当中（不需要注解）
		annotationConfigApplicationContext.register(SpringConfig.class);
		//annotationConfigApplicationContext.register(UserTest.class);

		//用来扫描包或类的方法，会调用AnnotationConfigApplicationContext中初始化的scanner对象
		//annotationConfigApplicationContext.scan("com.zdd.spring");

		//spring初始化的最后一个步骤，做了很多工作
		//首先会初始化一些属性
		//将实现了BeanFactoryPostProcessor接口的spring内部的对象ConfigurationClassPostProcessor或者使用者自定义的对象执行
		//注意这里spring认为使用者自定义的对象只有通过addBeanFactoryPostProcessor方法加入的
		annotationConfigApplicationContext.refresh();
		//UserTest userTest = annotationConfigApplicationContext.getBean(UserTest.class);
//		UserTest userTest1 = annotationConfigApplicationContext.getBean(UserTest.class);
		//userTest.test();
//		System.out.println(userTest.hashCode()+"-----------"+userTest1.hashCode());

		//通过beanName获得bean，注意是全名，包括包名
		//TestImportSelectorBean bean = (TestImportSelectorBean) annotationConfigApplicationContext.getBean(TestImportSelectorBean.class.getName());
		//通过实现类的class对象来获得bean
		//TestImportSelectorBean bean = annotationConfigApplicationContext.getBean(TestImportSelectorBean.class);
		//bean.test();

//		MyDao myDao = (MyDao) annotationConfigApplicationContext.getBean("myDao");
//		System.out.println(myDao.select());
	}
}
