package com.ankitgupta.designPatterns.decorator.pizza.decorator;

import com.ankitgupta.designPatterns.decorator.pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {

	private Pizza pizzaToDecorate;
	
	public PizzaDecorator(Pizza pizzaToDecorate){
		this.pizzaToDecorate = pizzaToDecorate;
	}
	
	@Override
	public String getDescription() {
		return pizzaToDecorate.getDescription() + "+" + getToppingDescription();
	}
	
	
	@Override
	public Double getCost(){
		return pizzaToDecorate.getCost() + getToppingCost();
	}
	
	public abstract String getToppingDescription();
	
	public abstract Double getToppingCost();
	
}
