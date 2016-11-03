package com.javaTest.studentManagerEx;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		manager.addStudent("ȫ�浿", 22, 201341303, "���ؿ�ȭ");
		manager.addStudent("ȫ���", 21, 201341304, "���ؿ�");
		manager.addStudent("ȫ���", 23, 201341305, "����");
		manager.addStudent("ȫ����", 24, 201341306, "��");
		manager.addStudent("ȫ����", 25, 201341307, "����ȭ");
	
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
		manager.students.get(0).updateInfo(1, "ȫ���");
		System.out.println(manager.students.get(0).getName());
		
		manager.studentExpel.addExpelStudent("������", 22, 232222, "�����");
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major){
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " �л����� �Է� ����!!");
	}
	
}
