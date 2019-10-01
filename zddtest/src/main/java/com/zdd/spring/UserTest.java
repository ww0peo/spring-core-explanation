package com.zdd.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


public class UserTest {

	@Resource
	private UserTest1 userTest1;


	public UserTest(){
		System.out.println("UserTest");
	}

	public void test(){
		System.out.println("test");
	}
}


