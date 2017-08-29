/**
 * 
 */
package com.wh.spring.helloworld.factoryBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class mainx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean-beanfactory.xml");
		Car car=(Car)ctx.getBean("car");
		System.out.println(car);
		
		

	}

}
