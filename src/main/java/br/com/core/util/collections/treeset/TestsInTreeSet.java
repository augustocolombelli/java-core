package br.com.core.util.collections.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TestsInTreeSet {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(6);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);

//		Set<City> cities = new TreeSet<>();
		Set<City> cities = new TreeSet<>(new CityByNameComparator());
		cities.add(new City(1, "Foz"));
		cities.add(new City(4, "Floripa"));
		cities.add(new City(3, "Porto"));
		cities.add(new City(2, "Cascavel"));

		System.out.println("Numbers: " + numbers);
		System.out.println("Cities: " + cities);
		
		City cityA = new City(8, "Curitiba");
		City cityB = new City(8, "Curitiba");
		
		System.out.println("City A is equals City B? "+cityA.equals(cityB));
		System.out.println("City A and City have same hashcode? "+(cityA.hashCode() == cityB.hashCode()));
		System.out.println("Hashcode of City A: "+cityA.hashCode());
		System.out.println("Hashcode of City B: "+cityB.hashCode());
		System.out.println("City A was added? "+cities.add(cityA));
		System.out.println("City B was added? "+cities.add(cityB));
		
	
	}

}
