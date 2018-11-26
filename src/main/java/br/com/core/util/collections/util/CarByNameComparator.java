package br.com.core.util.collections.util;

import java.util.Comparator;

public class CarByNameComparator implements Comparator<Car>{
	
	public int compare(Car c1, Car c2) {
		return c1.getName().compareTo(c2.getName());
	}

}
