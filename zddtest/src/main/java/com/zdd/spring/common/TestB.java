package com.zdd.spring.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestB {

	@Autowired
	private TestA testA;
}
