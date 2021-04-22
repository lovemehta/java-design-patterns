package com.lovemehta.java_design_patterns.behavioral.strategy;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {

	public BigDecimal applyDiscount(BigDecimal amount) {
		return amount.multiply(BigDecimal.valueOf(0.5));
	}
}