package com.javaTest.collectionsTest;

import java.util.HashMap;
import java.util.Iterator;

//hashMap test
public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		
		System.out.println(hashMap.toString());
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		System.out.println(hashMap.toString());
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		System.out.println(hashMap.toString());
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()){
			Integer key = iterator.next();
			System.out.println(key + ":" + hashMap.get(key));
		}
		
	}
}
