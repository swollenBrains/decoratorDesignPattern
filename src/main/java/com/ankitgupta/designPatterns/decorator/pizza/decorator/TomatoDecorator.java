package com.ankitgupta.designPatterns.decorator.pizza.decorator;

import com.ankitgupta.designPatterns.decorator.pizza.Pizza;

public class TomatoDecorator extends PizzaDecorator{

	public TomatoDecorator(Pizza pizzaToDecorate) {
		super(pizzaToDecorate);
		System.out.println("Adding tomato");
	}

	@Override
	public String getToppingDescription() {
		return "tomato";
	}

	@Override
	public Double getToppingCost() {
		return 10.00;
	}

}
