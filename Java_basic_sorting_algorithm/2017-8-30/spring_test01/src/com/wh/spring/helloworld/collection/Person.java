package com.wh.spring.helloworld.collection;

import com.wh.spring.helloworld.Car;

public class Person {
	
	private String name;
	private int age;
	private Car car;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}


}
