package br.com.core.util.collections.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceArrayListAndLinkedList {

	public static void main(String[] args) {
		addManyNumbersInFirsElement(new ArrayList<Integer>());
		addManyNumbersInFirsElement(new LinkedList<Integer>());
		getEachElement(new ArrayList<Integer>());
		getEachElement(new LinkedList<Integer>());
	}

	public static void addManyNumbersInFirsElement(List<Integer> numbers) {
		System.out.println("==========="+numbers.getClass().getName()+"===========");

		long start = System.currentTimeMillis();
		for (int i = 0; i < 100001; i++) {
			numbers.add(0, i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time to adding in the first element many values: " + (end - start));
	}
	
	public static void getEachElement(List<Integer> numbers) {
		System.out.println("==========="+numbers.getClass().getName()+"===========");
		for (int i = 0; i < 100001; i++) {
			numbers.add(i);
		}
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100001; i++) {
			numbers.add(i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time to get each element: " + (end - start));
	}
}
