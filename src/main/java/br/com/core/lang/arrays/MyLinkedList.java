package br.com.core.lang.arrays;

import java.security.acl.NotOwnerException;

public class MyLinkedList {

	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.addInBegin("A");
		myList.addInBegin("B");
		myList.addInBegin("C");
		myList.addInBegin("D");
		myList.addInBegin("E");
		myList.addInBegin("F");
		myList.add("G");

		System.out.println(myList.toString());

	}

	private Cell first;
	private Cell last;
	private int size = 0;

	public void addInBegin(String element) {
		Cell newCell = new Cell(element, first);
		this.first = newCell;
		if (this.size == 0) {
			this.last = this.first;
		}
		size++;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");
		Cell cellToPrint = first;
		for (int i = 0; i < size; i++) {
			string.append(cellToPrint.getElement());
			cellToPrint = cellToPrint.getNextElement();
			string.append(",");
		}
		string.append("]");
		return string.toString();
	}

	public void add(String element) {
		Cell cell = new Cell(element, null);
		this.last.setNextElement(cell);
		this.last = cell;
		this.size++;
	}

	public void add(int position, Object element) {
		throw new RuntimeException("Not implemented");
	}

	public Object get(int index) {
		throw new RuntimeException("Not implemented");
	}

	public void remove(int posicao) {
		throw new RuntimeException("Not implemented");
	}

	public int size() {
		throw new RuntimeException("Not implemented");
	}

	public boolean contain(Object o) {
		throw new RuntimeException("Not implemented");
	}

}
