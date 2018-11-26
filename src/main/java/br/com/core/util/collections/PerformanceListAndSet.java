package br.com.core.util.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class PerformanceListAndSet {

	public static void main(String[] args) {
		testPerformanceCollections(new ArrayList<Integer>());
		testPerformanceCollections(new LinkedList<Integer>());
		testPerformanceCollections(new Vector<Integer>());
		testPerformanceCollections(new HashSet<Integer>());
		testPerformanceCollections(new TreeSet<Integer>());
		testPerformanceCollections(new LinkedHashSet<Integer>());
	}

	private static void testPerformanceCollections(Collection<Integer> numbers) {
		System.out.println("==========================================");
		System.out.println("Testing in a "+numbers.getClass().getName());
		long before, after = 0;
		before = System.currentTimeMillis();
		for(int i=0; i< 100001; i++) {
			numbers.add(i);
		}
		after = System.currentTimeMillis();
		System.out.println("Milliseconds to insert: " +(after - before));
		
		before = System.currentTimeMillis();
		for(int i=0; i< 100001; i++) {
			numbers.contains(i);
		}
		after = System.currentTimeMillis();
		System.out.println("Milliseconds to verify if contains element: " +(after - before));
		
		before = System.currentTimeMillis();
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		after = System.currentTimeMillis();
		System.out.println("Milliseconds to remove elements: " +(after - before));
	}
}
