package com.javaTest.designPattern.strategyPattern;

public class StandardRobot extends Robot {

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("�� �� �ִ�");
	}

	@Override
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("�� �ִ�.");
	}

	@Override
	public void actionMisil() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� ����..");
	}

	public StandardRobot() {
		// TODO Auto-generated constructor stub
	}
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Standard robot�Դϴ�. ��, �ٸ�, ����, �Ӹ��� �ֽ��ϴ�.");
	}

}
