package com.lovemehta.java_design_patterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Discounter {

	public BigDecimal applyDiscount(BigDecimal amount);

}
