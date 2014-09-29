package com.ankitgupta.designPatterns.decorator.pizza.main;

import com.ankitgupta.designPatterns.decorator.pizza.Pizza;
import com.ankitgupta.designPatterns.decorator.pizza.PlainPizza;
import com.ankitgupta.designPatterns.decorator.pizza.decorator.MozarellaCheeseDecorator;
import com.ankitgupta.designPatterns.decorator.pizza.decorator.TomatoDecorator;

public class PizzaDecoratorLauncher {
	
	public static void main(String[] args) {
		//create base pizza
		Pizza basePizza = new PlainPizza();
		
		//add mozarella cheese
		Pizza myPizza = new TomatoDecorator(new MozarellaCheeseDecorator(basePizza));
		System.out.println("Description : "+ myPizza.getDescription());
		System.out.println("Cost : "+ myPizza.getCost());
		
		
	}
	
}
