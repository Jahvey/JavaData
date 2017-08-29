package com.wh.spring.helloworld.collection;

import java.util.ArrayList;

import com.wh.spring.helloworld.Car;

public class Person1 {
	private String name;
	private int age;
	private ArrayList<Car>cars;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", cars=" + cars + "]";
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
	 * @return the cars
	 */
	public ArrayList<Car> getCars() {
		return cars;
	}
	/**
	 * @param cars the cars to set
	 */
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	

}
