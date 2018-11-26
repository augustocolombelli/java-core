package br.com.core.util.collections.iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemovingWithIterator {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("João");
		names.add("Pedro");
		names.add("Lucas");
		names.add("Marcos");
		names.add("Matheus");
		
		System.out.println("Before removing...");
		System.out.println(names);
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			if(it.next().equals("Pedro")) {
				it.remove();
			}
		}
		System.out.println("Before removing...");
		System.out.println(names);
		
		
	}
	
}
