package br.com.core.util.collections.linkedlist;

import java.util.LinkedList;

public class TestsInLinkedLiet {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(25);
		numbers.add(14);
		numbers.add(16);
		
		System.out.println("List: " +numbers);
		System.out.println("The first element is: " +numbers.getFirst());
		System.out.println("The last element is: " +numbers.getLast());
		
		System.out.println("Removing first elements...");
		numbers.removeFirst();
		numbers.pop();
		System.out.println("List: " +numbers);
		
		System.out.println("Removing the last elements...");
		numbers.removeLast();
		System.out.println("List: " +numbers);

		System.out.println("Adding elements in begin of the list...");
		numbers.addFirst(44);
		numbers.push(55);
		System.out.println("List: " +numbers);
		
		System.out.println("Adding element in final of the list...");
		numbers.addLast(88);
		System.out.println("List: " +numbers);
		
		System.out.println("Index of the element: "+numbers.indexOf(14));
		System.out.println("The head element of the list is: "+numbers.peek());
		
		System.out.println("Head element of the list is: "+ numbers.poll());
		System.out.println("List: " +numbers);
		
		System.out.println("Adding element as the tail of the list...");
		numbers.offer(56);
		System.out.println("List: " +numbers);
	}
	
}
