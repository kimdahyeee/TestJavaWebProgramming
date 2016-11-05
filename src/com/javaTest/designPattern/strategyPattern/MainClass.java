package com.javaTest.designPattern.strategyPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperRobot superRobot = new SuperRobot();
		
		superRobot.shape();
		superRobot.actionFly();
		superRobot.actionKnife();
		superRobot.actionMisil();
		superRobot.actionRun();
		superRobot.actionWalk();
		
		LowRobot lowRobot = new LowRobot();
		
		lowRobot.shape();
		lowRobot.actionFly();
		lowRobot.actionKnife();
		lowRobot.actionMisil();
		lowRobot.actionRun();
		lowRobot.actionWalk();
		
		StandardRobot standard = new StandardRobot();
		
		standard.shape();
		standard.actionFly();
		standard.actionKnife();
		standard.actionMisil();
		standard.actionRun();
		standard.actionWalk();
	}

}
