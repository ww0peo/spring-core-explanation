package com.zdd.spring.BeanPostProcessor;

import com.zdd.spring.UserTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor1 implements BeanPostProcessor , PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserTest){
			System.out.println("postProcessBeforeInitialization1");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserTest){
			System.out.println("postProcessAfterInitialization1");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 102;
	}
}
