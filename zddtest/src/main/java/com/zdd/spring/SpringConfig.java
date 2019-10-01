package com.zdd.spring;

import com.zdd.spring.AutoDistribution.AutoImportBeanDefinitionRegistrar;
import com.zdd.spring.ImportSelector.MyAnnotation;
import com.zdd.spring.aop.AopAnnotation;
import com.zdd.spring.mybatis.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.zdd.spring.AutoDistribution")
@Import(AutoImportBeanDefinitionRegistrar.class)
//@AopAnnotation
//@MyAnnotation
//开启AOP的注解模式
@EnableAspectJAutoProxy
public class SpringConfig {

	@Bean
	public UserTest userTest(){
		return new UserTest();
	}

	@Bean
	public UserTest1 userTest1(){
		userTest();
		return new UserTest1();
	}

}
