package com.ankitgupta.designPatterns.decorator.pizza.decorator;

import com.ankitgupta.designPatterns.decorator.pizza.Pizza;

public class MozarellaCheeseDecorator extends PizzaDecorator{

	public MozarellaCheeseDecorator(Pizza pizzaToDecorate) {
		super(pizzaToDecorate);
		System.out.println("Adding cheese");
	}

	@Override
	public String getToppingDescription() {
		return "moz cheese";
	}

	@Override
	public Double getToppingCost() {
		return 15.00;
	}

}
