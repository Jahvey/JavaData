package com.wh.spring.helloworld.sepl;



public class Person {
	
	
	private String name;
	//city引用了address bean中的city的属性值
	private String city;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", car=" + car + ", info=" + info + "]";
	}

	private Car car;
	private String info;

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
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

	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
