package br.com.core.util.collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtils {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(25);
		numbers.add(14);
		numbers.add(16);
		
		List<String> names = new ArrayList<>();
		names.add("João");
		names.add("Pedro");
		names.add("José");
		names.add("Maria");
		names.add("Paulo");
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(3, "Fox"));
		cars.add(new Car(2, "Gol"));
		cars.add(new Car(1, "Siena"));
		cars.add(new Car(5, "Crossfox"));
		cars.add(new Car(4, "Strada"));
		
		System.out.println("========== MAX ==========");
		System.out.println("Max number: " +Collections.max(numbers));
		System.out.println("Max name: " +Collections.max(names));
		System.out.println("Max car by natural order: " +Collections.max(cars));
		System.out.println("Max car by name: " +Collections.max(cars, new CarByNameComparator()));
		
		System.out.println("========== MIN ==========");
		System.out.println("Min number: " +Collections.min(numbers));
		System.out.println("Min name: " +Collections.min(names));
		System.out.println("Min car by natural order: " +Collections.min(cars));
		System.out.println("Min car by name: " +Collections.min(cars, new CarByNameComparator()));
		
		System.out.println("========== REVERSE ==========");
		Collections.reverse(names);
		System.out.println(names);
		
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		Collections.reverse(cars);
		System.out.println(cars);
		
	}
	
}
