package br.com.core.util.collections.arraylist;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DecreasingOrderWithArrayListOfIntegers {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>((n1, n2) -> Integer.compare(n1, n2));
		for(int i = 0; i<100; i++ ) {
			numbers.add(new Random().nextInt());
		}
		System.out.println("Original set: "+numbers);
	}
	
}
