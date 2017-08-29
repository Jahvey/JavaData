package com.wh.spring.helloworld.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("bean-autowire.xml");
		
		Person person=(Person) ctx1.getBean("person1");
		
		//System.out.println(person);
		
		System.out.println("==============");
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("bean-relation.xml");
		
		Address address=(Address) ctx2.getBean("address2");
		
		System.out.println(address);
		address=(Address) ctx2.getBean("address3");
		
		System.out.println(address);
		
		System.out.println("==============");
		
		
		Person pers=(Person) ctx2.getBean("person1");
		System.out.println(pers);
		System.out.println("==============");
		
		
	}

}
