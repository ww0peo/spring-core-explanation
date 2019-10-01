package com.zdd.spring.BeanPostProcessor;

import com.zdd.spring.UserTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//还可以通过注解实现排序
//@Order(101)
public class MyBeanPostProcessor implements BeanPostProcessor , PriorityOrdered {

	/**
	 * 初始化bean之前回调
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserTest){
			System.out.println("postProcessBeforeInitialization");
		}
		return bean;
	}
	/**
	 * 初始化bean之后回调
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserTest){
			System.out.println("postProcessAfterInitialization");
		}
		return bean;
	}

	/**
	 * 决定后置处理器顺序
	 * 返回的值越小越先执行
	 * @return
	 */
	@Override
	public int getOrder() {
		return 101;
	}
}
