package com.zdd.spring.mybatis;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class MyFactoryBean implements  InvocationHandler {
	//动态注入的接口
//	Class clazz;
//
//	//通过构造器自动装配
//	public MyFactoryBean1(Class clazz) {
//		this.clazz = clazz;
//	}

//	@Override
//	public Object getObject() throws Exception {
//		//真正的实现类
//		return Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{clazz},this);
//	}
//
//	@Override
//	public Class<?> getObjectType() {
//		return clazz;
//	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//在这里可以实现对注解的解析和实现
		if (method.isAnnotationPresent(MySelect.class)){
			//将注解的内容返回出去
			//模拟sql查询
			return method.getAnnotation(MySelect.class).value();
		}
		return null;
	}
}
