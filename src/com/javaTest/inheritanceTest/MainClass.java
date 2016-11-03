package com.javaTest.inheritance;

public class MainClass {
	public static void main(String[] args) {
		ChildClass childC = new ChildClass();
		
		System.out.println(childC.cStr);
		childC.getPapaName();
		childC.getMamiName();
		System.out.println(childC.pStr);
	}
}
