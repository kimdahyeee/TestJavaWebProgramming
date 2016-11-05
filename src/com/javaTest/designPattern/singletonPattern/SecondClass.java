package com.java.designPattern.singletonPatern;

public class SecondClass {

	public SecondClass() {
		// TODO Auto-generated constructor stub
		SingletonClass single = SingletonClass.getSingletonClass();
		
		System.out.println("Second Class");
		System.out.println("i = " + single.getI());
	}
}
