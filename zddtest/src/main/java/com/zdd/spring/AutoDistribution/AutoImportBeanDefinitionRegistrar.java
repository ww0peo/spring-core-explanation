package com.zdd.spring.AutoDistribution;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class AutoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//拿到gbd
		GenericBeanDefinition autoTest1 = (GenericBeanDefinition) registry.getBeanDefinition("autoTest1");
		//设置gbd的自动装配模式为byType
		autoTest1.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
		//重新注册bd
		registry.registerBeanDefinition("autoTest1",autoTest1);
	}
}
