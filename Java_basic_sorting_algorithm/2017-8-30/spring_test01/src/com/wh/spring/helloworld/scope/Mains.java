package com.wh.spring.helloworld.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("bean-scope.xml");
		
		Car car=(Car) ctx1.getBean("car");
		Car car2=(Car) ctx1.getBean("car");
		System.out.println(car==car2);
		
		
		
		System.out.println("==============");
		
		
	}

}
