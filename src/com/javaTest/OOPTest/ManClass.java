package com.javaTest.OOPTest;

public class ManClass {

	//instance
	private int age;
	private int height;
	private int weight;
	private String phoneNumber;
	
	public ManClass() {
		// TODO Auto-generated constructor stub
	}
	
	public ManClass(int age, int height, int weight, String phoneNumber){
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNumber = phoneNumber;
	}
	
	public double calculateBMI(){
		double result = weight/(height*height);
		return result;
	}

	//getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
