package com.wh.spring.helloworld.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 1.result:
car constructor...
setBrand....
postProcessBeforeInitialization...Car [brand=Audi1],car
init...
postProcessAfterInitialization...Car [brand=Audi1],car
Car [brand=Audi1]
八月 30, 2017 12:00:35 上午 org.springframework.context.support.AbstractApplicationContext doClose
信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@1f17ae12: startup date [Wed Aug 30 00:00:34 CST 2017]; root of context hierarchy
destroy...
 * 
 * */
public class Mainx {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct=new ClassPathXmlApplicationContext("bean-cycles.xml");
		
		Car car=(Car)ct.getBean("car");
		System.out.println(car);
		
		
		//关闭IOC容器
		ct.close();
		
		
	}

}
