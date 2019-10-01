package com.zdd.spring.AutoDistribution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AutoTest2 {

	private AutoTest1 autoTest1;

	public AutoTest1 getAutoTest1() {
		return autoTest1;
	}

	public void setAutoTest1(AutoTest1 autoTest1) {
		this.autoTest1 = autoTest1;
	}
}
