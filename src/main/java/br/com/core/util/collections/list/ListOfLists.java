package br.com.core.util.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListOfLists {

	public static void main(String[] args) {
		List<List<Integer>> listOfListNumbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				listOfListNumbers.add(new ArrayList<Integer>());
				for (int a = 0; a < 5; a++) {
					listOfListNumbers.get(i).add(a);
				}
			} else {
				listOfListNumbers.add(new LinkedList<Integer>());
				for (int l = 0; l < 8; l++) {
					listOfListNumbers.get(i).add(l);
				}
			}
		}

		Iterator<List<Integer>> it = listOfListNumbers.iterator();
		while (it.hasNext()) {
			List<Integer> numbers = it.next();
			System.out.println(numbers.getClass().getName());
			Iterator<Integer> innerIterator = numbers.iterator();
			while (innerIterator.hasNext()) {
				System.out.println(innerIterator.next());
			}
		}
	}

}
