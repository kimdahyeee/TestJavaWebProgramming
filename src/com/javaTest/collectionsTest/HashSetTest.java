package com.javaTest.collectionsTest;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("ȫ�浿", 3));
		hashSet.add(new Student("�̼���", 6));
		hashSet.add(new Student("�˲�", 4));
		hashSet.add(new Student("�ٺ�", 1));
		
		System.out.println(hashSet.toString());
		
		Student student = new Student("�˲�", 4);
		hashSet.remove(student);
		System.out.println(hashSet.toString());
	}

}
