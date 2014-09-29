package com.ankitgupta.designPatterns.decorator.pizza;

public class PlainPizza implements Pizza{

	public PlainPizza(){
		System.out.println("Baking pizza bed");
	}
	
	@Override
	public String getDescription() {
		return "Pizza base";
	}

	@Override
	public Double getCost() {
		return 75.00;
	}

}
