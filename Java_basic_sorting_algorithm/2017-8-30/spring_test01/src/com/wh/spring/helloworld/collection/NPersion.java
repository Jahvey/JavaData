package com.wh.spring.helloworld.collection;

import java.util.List;
import java.util.Map;

import com.wh.spring.helloworld.Car;

public class NPersion {
	private int age;
	private String name;
	private Map<String	, Car>cars;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "NPersion [age=" + age + ", name=" + name + ", cars=" + cars + "]";
	}
	
	
	
	
	

}
