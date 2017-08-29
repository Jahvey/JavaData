package com.wh.spring.helloworld.Factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法，直接调用某一个类的静态方法就可以访问 Bean的实例
 * @author Administrator
 *
 */
public class StaticCarFactory {
	private static Map<String,Car> cars=new HashMap<>();
	
	static{
		cars.put("audi1",new Car("audi1",30000 ));
		cars.put("ford",new Car("ford",30000 ));
		
	}
	
	
	//静态工厂方法 配置car实例
	public static Car getCar(String name){
		return cars.get(name);
		
	}
	

}
