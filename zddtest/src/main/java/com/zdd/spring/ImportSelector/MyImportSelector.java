package com.zdd.spring.ImportSelector;

import com.zdd.spring.mybatis.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println(TestImportSelectorBean.class.getName());
		return new String[]{TestImportSelectorBean.class.getName()};
	}
}
