package com.zdd.spring.autoTest;

import org.springframework.stereotype.Component;

@Component
public class TestB implements Test{
	@Override
	public void test() {
		System.out.println("TestB");
	}
}
