package com.wh.spring.helloworld.Factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainx {

	public static void main(String[] args) {
/**
 * 以上代码测试静态工厂方法
 */
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean-factory.xml");
		System.out.println("通过静态工厂来创建bean");
		Car car=(Car)ctx.getBean("car1");
		System.out.println(car);
		System.out.println("通过实例工厂来创建bean");
		 car=(Car)ctx.getBean("car2");
		System.out.println(car);
		ctx.close();
	}

}
