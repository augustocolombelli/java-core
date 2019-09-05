package br.com.core.math.bigdecimal;

import static java.math.BigDecimal.valueOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BigDecimalComparatorLessThanTest {

	private BigDecimalComparator comparator;
	
	@Before
	public void setUp() {
		comparator = new BigDecimalComparator();
	}
	
	@Test
	public void shouldReturnFalseWhenValueOneIsGreaterThanValueTwo() {
		BigDecimal valueOne = valueOf(1);
		BigDecimal valueTwo = valueOf(0.9);
		
		assertFalse(comparator.isLessThan(valueOne, valueTwo));
	}
	
	@Test
	public void shouldReturnTrueWhenValueOneIsLessThanValueTwo() {
		BigDecimal valueOne = valueOf(0.9);
		BigDecimal valueTwo = valueOf(1);
		
		assertTrue(comparator.isLessThan(valueOne, valueTwo));
	}
	
	@Test
	public void shouldReturnFalseWhenValueOneIsEqualToValueTwo() {
		BigDecimal valueOne = valueOf(1);
		BigDecimal valueTwo = valueOf(1);
		
		assertFalse(comparator.isLessThan(valueOne, valueTwo));
	}
	
}
