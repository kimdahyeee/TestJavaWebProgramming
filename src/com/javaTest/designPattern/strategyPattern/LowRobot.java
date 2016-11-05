package com.javaTest.designPattern.strategyPattern;

public class LowRobot extends Robot{

	public LowRobot() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 없다.");
	}


	@Override
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("검 없다.");
	}


	@Override
	public void actionMisil() {
		// TODO Auto-generated method stub
		System.out.println("미사일 없다.");
	}

	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Low robot입니다. 팔, 다리, 몸통, 머리가 있습니다.");
	}
}
