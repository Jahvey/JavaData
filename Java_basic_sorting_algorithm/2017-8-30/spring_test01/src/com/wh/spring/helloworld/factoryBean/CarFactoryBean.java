package com.wh.spring.helloworld.factoryBean;

import org.springframework.beans.factory.FactoryBean;
/**
 * 自定义
 * @author Administrator
 *
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "CarFactoryBean [brand=" + brand + "]";
	}
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 500000);
	}
/**
 * 返回Bean的类型
 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
