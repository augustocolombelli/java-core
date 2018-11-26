package br.com.core.lang.arrays;

import java.util.Iterator;

public class MyArrayIterator<E> implements Iterator<E> {

	private Object[] items;
	private int actualIndex = 0;
	private int position = 0;

	public MyArrayIterator(Object[] items, int actualIndex) {
		this.items = items;
		this.actualIndex = actualIndex;
	}

	@Override
	public boolean hasNext() {
		return position < actualIndex;
	}

	@Override
	public E next() {
		E element = (E) items[position];
		position++;
		return element;
	}
}
