package com.zdd.spring.autoTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TestService implements ApplicationContextAware {

	ApplicationContext applicationContext;

	//可以通过map注入多个实现类
	@Autowired
	Map<String,Test> testMap;

	Test test;

	public void selectTest(String str){
		if(str.equals("A")){
			test = (Test) applicationContext.getBean("testA");
			test.test();
		}else if (str.equals("B")){
			test = (Test) applicationContext.getBean("testB");
			test.test();
		}
	}

	//同样可以通过applicationContext对象拿到指定的bean
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
