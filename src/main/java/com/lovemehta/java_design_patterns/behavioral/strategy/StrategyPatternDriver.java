package com.lovemehta.java_design_patterns.behavioral.strategy;

import java.math.BigDecimal;

public class StrategyPatternDriver {

//The strategy pattern allows us to change the behavior of an algorithm at runtime.

	public static void main(String[] args) {

		Discounter easterDiscounter = new EasterDiscounter();

		BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));

		if (discountedValue.compareTo(BigDecimal.valueOf(50)) == 0) {
			System.out.println("Discount Applied.");
		}
	}
}
