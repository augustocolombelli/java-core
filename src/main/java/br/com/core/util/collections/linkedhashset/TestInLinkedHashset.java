package br.com.core.util.collections.linkedhashset;

import java.util.LinkedHashSet;

public class TestInLinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		numbers.add(12);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(0);
		
		System.out.println(numbers);
		numbers.removeIf(new RemoveZeroPredicate());
		System.out.println(numbers);
	}
	
}
