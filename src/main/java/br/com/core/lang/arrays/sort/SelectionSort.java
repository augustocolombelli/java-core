package br.com.core.lang.arrays.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] numbers = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		for (int i = 0; i < numbers.length; i++) {
			int minorNumber = findMinor(numbers, i);
			int aux = numbers[i];
			numbers[i] = numbers[minorNumber];
			numbers[minorNumber] = aux;
		}
		System.out.println(Arrays.toString(numbers));
	}

	private static int findMinor(Integer[] numbers, int startPoint) {
		int minor = startPoint;
		for (int atual = startPoint; atual < numbers.length; atual++) {
			if (numbers[atual] < numbers[minor]) {
				minor = atual;
			}
		}
		return minor;
	}

}
