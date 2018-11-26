package br.com.core.util.collections.treeset;

import java.util.Comparator;

public class CityByNameComparator implements Comparator<City>{

	public int compare(City c1, City c2) {
		return c1.getName().compareTo(c2.getName());
	}
	
}
