package br.com.core.math.bigdecimal;

import static java.math.BigDecimal.valueOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class BigDecimalComparatorGreaterThanTest {

	private BigDecimalComparator comparator;
	
	@Before
	public void setUp() {
		comparator = new BigDecimalComparator();
	}
	
	@Test
	public void shouldReturnTrueWhenValueOneIsGreaterThanValueTwo() {
		BigDecimal valueOne = valueOf(1);
		BigDecimal valueTwo = valueOf(0.9);
		
		assertTrue(comparator.isGreaterThan(valueOne, valueTwo));
	}
	
	@Test
	public void shouldReturnFalseWhenValueOneIsLessThanValueTwo() {
		BigDecimal valueOne = valueOf(0.9);
		BigDecimal valueTwo = valueOf(1);
		
		assertFalse(comparator.isGreaterThan(valueOne, valueTwo));
	}
	
	@Test
	public void shouldReturnFalseWhenValueOneIsEqualToValueTwo() {
		BigDecimal valueOne = valueOf(1);
		BigDecimal valueTwo = valueOf(1);
		
		assertFalse(comparator.isGreaterThan(valueOne, valueTwo));
	}
	
}
