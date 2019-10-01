package com.zdd.spring.AutoDistribution;

import org.springframework.stereotype.Component;

@Component
public class AutoTest1 {
	private AutoTest2 autoTest2;

	public AutoTest2 getAutoTest2() {
		return autoTest2;
	}

	public void setAutoTest2(AutoTest2 autoTest2) {
		this.autoTest2 = autoTest2;
	}
}
