package com.javaTest.studentManagerEx;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		manager.addStudent("È«±æµ¿", 22, 201341303, "¿¬±Ø¿µÈ­");
		manager.addStudent("È«±æ´ç", 21, 201341304, "¿¬±Ø¿µ");
		manager.addStudent("È«±æµÕ", 23, 201341305, "¿¬±Ø");
		manager.addStudent("È«±æÅë", 24, 201341306, "¿¬");
		manager.addStudent("È«±æÅÁ", 25, 201341307, "¿¬±ØÈ­");
	
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
		manager.students.get(0).updateInfo(1, "È«±æ¶Ë");
		System.out.println(manager.students.get(0).getName());
		
		manager.studentExpel.addExpelStudent("°¡³ª´Ù", 22, 232222, "¿µ¾î¿µ¹®");
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major){
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " ÇĞ»ıÁ¤º¸ ÀÔ·Â ¼º°ø!!");
	}
	
}
