package br.com.core.lang.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray<E> implements Iterable<E> {

	private Object[] elements;
	private int actualIndex;

	public MyArray(int positions) {
		this.elements = new Object[positions];
		this.actualIndex = 0;
	}

	public void add(E element) {
		elements[actualIndex] = element;
		actualIndex++;
	}

	public void add(E element, int position) {
		for(int i = actualIndex - 1; i >= position; i--) {
			elements[i + 1] = elements[i];
		}
		elements[position] = element;
		actualIndex++;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) elements[index];
	}

	public void remove(E elementToRemove) {
		for (int i = 0; i < actualIndex; i++) {
			// Encontrou o elemento
			if (elements[i].equals(elementToRemove)) {
				// Salva a posicao dele
				int indexRemoved = i;
				// Percorre do elemento removido até o final da lista
				for (int j = indexRemoved; j < actualIndex; j++) {
					// adiciona ao elemento o elemento posterior
					elements[j] = elements[j + 1];
				}
				actualIndex--;
			}
		}
	}

	public String toString() {
		return Arrays.toString(elements);
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> it = new MyArrayIterator<E>(this.elements, actualIndex);
		return it;
	}

	public static void main(String[] args) {
		MyArray<String> strings = new MyArray<>(5);
		strings.add("A");
		strings.add("B");
		strings.add("C");

		System.out.println("Printing with all values...");
		for (String s : strings) {
			System.out.println(s);
		}

		strings.remove("B");
		strings.remove("A");

		System.out.println("Printing after remove values..");
		for (String s : strings) {
			System.out.println(s);
		}

		System.out.println("Printing after add in a specific position...");
		strings.add("T");
		strings.add("Z");
		System.out.println(strings.toString());
		//strings.add("K", 1);
		strings.add("K", 1);
		strings.add("LL", 3);
		System.out.println(strings.toString());
	}

}
