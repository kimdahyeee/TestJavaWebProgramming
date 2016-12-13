package com.javaTest.collectionsTest;

public class Student {

	String name;
	int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade =grade;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name +"이고 점수는 " + grade;
	}

	@Override
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}
