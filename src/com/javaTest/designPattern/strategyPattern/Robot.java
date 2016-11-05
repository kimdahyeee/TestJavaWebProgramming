package com.javaTest.designPattern.strategyPattern;

public abstract class Robot {

	public Robot() {
		// TODO Auto-generated constructor stub
	}

	public void actionWalk(){
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun(){
		System.out.println("달릴 수 있습니다.");
	}
	
	public abstract void actionFly();
	public abstract void actionKnife();
	public abstract void actionMisil();
	
}
