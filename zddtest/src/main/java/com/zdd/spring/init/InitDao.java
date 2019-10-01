package com.zdd.spring.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitDao implements InitializingBean {

	/**
	 * 下面三个方法的回调顺序如下
	 *
	 * InitDao()----→init()----→afterPropertiesSet()
	 *
	 */
    public InitDao(){
        System.out.println("TestDao");
    }

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
