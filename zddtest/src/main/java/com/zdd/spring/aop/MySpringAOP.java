package com.zdd.spring.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;


public class MySpringAOP implements BeanPostProcessor {

    /**
     * 通过这个方法拿到bean对象
	 * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//必须要做判断，因为有很多spring内部的bean是不需要我们实现动态代理的
		if (bean instanceof TestAOP)
		bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), bean.getClass().getInterfaces(), new MyInvocationHandler(bean));
		return	bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
