package com.javaTest.variableTest;

import java.util.Scanner;

public class TestCalculation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		System.out.println("i % 3 = "+ (i % 3));
		
		scanner.close();
	}
	
}
