package com.wh.spring.helloworld.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wh.spring.helloworld.Car;

public class NMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean1.xml");
		// using bean

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);

		NPersion p = (NPersion) ctx.getBean("nPerson");
		System.out.println(p);
		
		DataSource dataSource=(DataSource) ctx.getBean("datasource");
		System.out.println(dataSource);
		
		
		Person1 p1=(Person1) ctx.getBean("nPerson1");
		
		System.out.println("============");
		System.out.println(p1);
		
		Person1 p2=(Person1) ctx.getBean("person2");
		System.out.println(p2);
		
	}

}
