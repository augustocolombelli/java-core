package br.com.core.math.bigdecimal;

import static java.math.BigDecimal.valueOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class BigDecimalComparatorEqualToTest {
	
	private BigDecimalComparator comparator;
	
	@Before
	public void setUp() {
		comparator = new BigDecimalComparator();
	}
	
	@Test
	public void shouldReturnFalseWhenValueOneIsGreaterThanValueTwo() {
		BigDecimal valueOne = valueOf(1);
		BigDecimal valueTwo = valueOf(0.9);
		
		assertFalse(comparator.isEqualTo(valueOne, valueTwo));
	}
	
	@Test
	public void shouldReturnFalseWhenValueOneIsLessThanValueTwo() {
		BigDecimal valueOne = valueOf(0.9);
		BigDecimal valueTwo = valueOf(1);
		
		assertFalse(comparator.isEqualTo(valueOne, valueTwo));
	}
	
	@Test
	public void shouldReturnTrueWhenValueOneIsEqualToValueTwo() {
		BigDecimal valueOne = valueOf(1);
		BigDecimal valueTwo = valueOf(1);
		
		assertTrue(comparator.isEqualTo(valueOne, valueTwo));
	}
	
}
