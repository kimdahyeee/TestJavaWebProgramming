package com.javaTest.designPattern.strategyPattern;

public class LowRobot extends Robot{

	public LowRobot() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("�� �� ����.");
	}


	@Override
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("�� ����.");
	}


	@Override
	public void actionMisil() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� ����.");
	}

	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Low robot�Դϴ�. ��, �ٸ�, ����, �Ӹ��� �ֽ��ϴ�.");
	}
}
