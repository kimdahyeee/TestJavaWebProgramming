package com.javaTest.inheritance;

public class ChildClass extends ParentClass{
	public String cStr = "자식 클래스";
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getMamiName() {
		// TODO Auto-generated method stub
		
		System.out.println("ddd");
		super.getMamiName();
	}
}
