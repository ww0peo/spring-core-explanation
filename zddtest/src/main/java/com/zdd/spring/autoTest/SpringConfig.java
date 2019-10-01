package com.zdd.spring.autoTest;

import com.zdd.spring.AutoDistribution.AutoImportBeanDefinitionRegistrar;
import com.zdd.spring.UserTest;
import com.zdd.spring.UserTest1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.zdd.spring.autoTest")
public class SpringConfig {


}
