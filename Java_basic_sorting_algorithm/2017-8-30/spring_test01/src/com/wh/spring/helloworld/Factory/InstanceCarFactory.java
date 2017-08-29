package com.wh.spring.helloworld.Factory;

import java.util.HashMap;
import java.util.*;

/**
 * 实例工厂方法
 * 即需要创建工厂本身，在调用工厂的实例方法来返回bean的实例
 * @author Administrator
 *
 */
public class InstanceCarFactory {
	
	
	
	private Map<String,Car>cars=null;
	
	public InstanceCarFactory(){
		cars=new HashMap<>();
		cars.put("audi1",new Car("audi1",30000 ));
		cars.put("ford2",new Car("ford2",30011 ));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
	
	
	

}
