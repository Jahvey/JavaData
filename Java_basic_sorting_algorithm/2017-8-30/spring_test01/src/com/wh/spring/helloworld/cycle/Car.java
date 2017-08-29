package com.wh.spring.helloworld.cycle;

public class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car constructor...");
	}
	
	
	private String brand;
	
//	public void setBrand(String brand) {
//		System.out.println("setBrand....");
//		this.brand = brand;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		System.out.println("setBrand....");
		this.brand = brand;
	}




	public  void init(){
		
		System.out.println("init...");
	}
	
	
	public void destroy(){
		System.out.println("destroy...");
	}

}
