package com.susheelkb.strategypattern;

public class CityDuck extends Duck {	
	//constructor to initialise behavior
	public CityDuck(){
		flyBehavior = new FlyICant();
		quackBehavior = new QuackInEnglish();
	}
	
	public void display() {
		System.out.println("I am a city duck");
		
	}
	
	
}
