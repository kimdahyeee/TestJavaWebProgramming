package com.javaTest.variableTest;

import java.util.Scanner;

public class TestGugudan {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		TestGugudan testG = new TestGugudan();
		testG.gugudan(input);
		
		scanner.close();
	}
	
	public void gugudan(int i){
		for(int j=1; j<10; j++){
			System.out.println(i + " * " + j +" = "+ (i*j));
		}
	}
	
	
}
