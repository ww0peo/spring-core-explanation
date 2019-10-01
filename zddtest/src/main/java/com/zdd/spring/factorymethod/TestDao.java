package com.zdd.spring.factorymethod;

public class TestDao {



	public void test(){
		System.out.println("TestDao");
	}


	// 工厂方法必须是static方法
	// spring会直接调用这个方法来初始化bean
	public static RealDao initFactoryMethod(){
		return new RealDao();
	}

}
