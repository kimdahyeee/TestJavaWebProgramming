package com.java.designPattern.singletonPatern;

public class FirstClass {

	public FirstClass() {
		// TODO Auto-generated constructor stub
	
		SingletonClass single = SingletonClass.getSingletonClass();
		
		System.out.println("FirstClass");
		System.out.println("i = " + single.getI());
		single.setI(200);
		System.out.println("i = "  + single.getI());
	}
	
}
