package br.com.core.util.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class TestsInHashSet {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(1);
		numbers.add(8);
		numbers.add(10);
		
		Set<String> names = new HashSet<>();
		names.add("Pedro");
		names.add("Paulo");
		names.add("Matheus");
		names.add("Marcos");
		names.add("Maria");
		
		Set<Computer> computers = new HashSet<>();
		computers.add(new Computer(2, "Black"));
		computers.add(new Computer(1, "Silver"));
		computers.add(new Computer(4, "White"));
		computers.add(new Computer(5, "Red"));
		computers.add(new Computer(3, "Blue"));
		
		System.out.println("Numbers elements: "+numbers);
		System.out.println("Names elements: "+names);
		
		System.out.println("Added the same name? " +names.add("Pedro"));
		System.out.println("Names elements: "+names);
		
		System.out.println("Added the same number? " +numbers.add(8));
		System.out.println("Numbers elements: "+numbers);
		
		
		Computer computerA = new Computer(15, "Pink");
		Computer computerB = new Computer(15, "Pink");
		
		System.out.println("Computer A is equals Computer B: "+ computerA.equals(computerB));
		System.out.println("Hashcode of Computer A: "+ computerA.hashCode());
		System.out.println("Hashcode of Computer B: "+ computerA.hashCode());
		
		System.out.println("Added the Computer A? " +computers.add(computerA));
		System.out.println("Added the Computer B? " +computers.add(computerA));
		System.out.println("Computers elements: "+computers);
		
	}
	
}
