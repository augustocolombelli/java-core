package br.com.core.util.collections.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DecreasingOrderWithTreeSetOfIntegers {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i<100; i++ ) {
			numbers.add(new Random().nextInt());
		}
		System.out.println("Original list: "+numbers);
		Collections.sort(numbers, (n1, n2) -> Integer.compare(n1, n2));
		System.out.println("Decreasing order list: "+numbers);
		
	}
	
}
