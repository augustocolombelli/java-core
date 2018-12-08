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
		ajustSize();
		elements[actualIndex] = element;
		actualIndex++;
	}

	public void add(E element, int position) {
		ajustSize();
		for (int i = actualIndex - 1; i >= position; i--) {
			elements[i + 1] = elements[i];
		}
		elements[position] = element;
		actualIndex++;
	}

	private void ajustSize() {
		if(actualIndex == elements.length) {
			Object[] newArray = new Object[2*elements.length];
			
			for(int i =0; i< elements.length; i++) {
				newArray[i] = elements[i];
			}
			
			elements = newArray;
		}
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

	public void remove(int position) {
		for (int i = position; i < actualIndex - 1; i++) {
			elements[i] = elements[i + 1];
		}
		actualIndex--;
		elements[actualIndex] = null;
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
		strings.add("D");
		strings.add("E");
		strings.add("F");
		strings.add("G");
		strings.add("H");
		strings.add("I");
		strings.add("J");
		strings.add("L");
		
		System.out.println(strings.toString());
	}

}
