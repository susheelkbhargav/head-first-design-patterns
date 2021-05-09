package com.susheelkb.strategypattern;

public class StrategyPatternApp {
	public static void main(String [] args){
		Duck gullyBoy = new CityDuck();
		gullyBoy.performFly();
		gullyBoy.performQuack();
	}
}
