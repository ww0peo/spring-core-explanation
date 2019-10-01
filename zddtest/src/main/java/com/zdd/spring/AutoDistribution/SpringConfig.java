package com.zdd.spring.AutoDistribution;

import com.zdd.spring.UserTest;
import com.zdd.spring.UserTest1;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.zdd.spring.AutoDistribution")
@Import(AutoImportBeanDefinitionRegistrar.class)
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
