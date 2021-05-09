package com.susheelkb.strategypattern;

public class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck(){
		
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	//public void display();
}
