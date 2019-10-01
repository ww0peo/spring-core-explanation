package com.zdd.spring.mybatis;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//假设前面做了包的扫描得到了需要实现的接口
		//假如已经得到了MyDao这个接口
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyDao.class);
		//这里得到了一个普通的bd，但是这还没完，因为没有实现类，所以spring是无法实例化bean的
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		//但是如何在spring实例化bean的时候知道需要实例化哪个接口呢
		//这里通过设置了构造器的参数名字来使spring能够找到需要实现的接口，注意这里传入的是接口的全名，包括包名
		//因为spring自动注入如果是通过构造器来注入的话是根据参数名来注入的
		System.out.println(beanDefinition.getBeanClassName());
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.zdd.spring.mybatis.MyDao");
		//这里是一个代理对象
		beanDefinition.setBeanClass(MyFactoryBean.class);

		//这里第一个参数是beanName，也是初始化时通过上下文对象拿到bean的名字
		//第二个参数是需要注册的bd
		registry.registerBeanDefinition("myDao",beanDefinition);

	}
}
