package com.zdd.spring.ImportAware;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.stereotype.Component;

import java.util.Set;

@Configuration
public class MyImportAware implements ImportAware {

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		Set<MethodMetadata> testBean = importMetadata.getAnnotatedMethods("testBean");
		for (MethodMetadata methodMetadata : testBean) {
			System.out.println(methodMetadata);
		}
	}
}
