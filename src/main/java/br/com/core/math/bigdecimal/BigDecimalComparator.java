package br.com.core.math.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalComparator {

	public boolean isGreaterThan(BigDecimal valueOne, BigDecimal valueTwo) {
		return valueOne.compareTo(valueTwo) > 0;
	}

	public boolean isLessThan(BigDecimal valueOne, BigDecimal valueTwo) {
		return valueOne.compareTo(valueTwo) < 0;
	}

	public boolean isEqualTo(BigDecimal valueOne, BigDecimal valueTwo) {
		return valueOne.compareTo(valueTwo) == 0;
	}

}
