package com.zdd.spring.mybatis;

public interface MyDao {

	@MySelect("select * from mydao")
	public String select();

}
