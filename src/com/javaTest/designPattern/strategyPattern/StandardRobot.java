package com.javaTest.designPattern.strategyPattern;

public class StandardRobot extends Robot {

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 있다");
	}

	@Override
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("검 있다.");
	}

	@Override
	public void actionMisil() {
		// TODO Auto-generated method stub
		System.out.println("미사일 없다..");
	}

	public StandardRobot() {
		// TODO Auto-generated constructor stub
	}
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Standard robot입니다. 팔, 다리, 몸통, 머리가 있습니다.");
	}

}
