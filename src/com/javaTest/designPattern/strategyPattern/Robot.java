package com.javaTest.designPattern.strategyPattern;

public abstract class Robot {

	public Robot() {
		// TODO Auto-generated constructor stub
	}

	public void actionWalk(){
		System.out.println("���� �� �ֽ��ϴ�.");
	}
	
	public void actionRun(){
		System.out.println("�޸� �� �ֽ��ϴ�.");
	}
	
	public abstract void actionFly();
	public abstract void actionKnife();
	public abstract void actionMisil();
	
}
