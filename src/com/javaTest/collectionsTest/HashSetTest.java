package com.javaTest.collectionsTest;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("È«±æµ¿", 3));
		hashSet.add(new Student("ÀÌ¼ø½Å", 6));
		hashSet.add(new Student("¶Ë²¿", 4));
		hashSet.add(new Student("¹Ùº¸", 1));
		
		System.out.println(hashSet.toString());
		
		Student student = new Student("¶Ë²¿", 4);
		hashSet.remove(student);
		System.out.println(hashSet.toString());
	}

}
