package com.zdd.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object object;

	public MyInvocationHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//AOP的增强都可以在这里实现
		System.out.println("动态代理");
		method.invoke(object,args);
		return null;
	}
}
