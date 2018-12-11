package br.com.core.lang.arrays.sort;

import java.util.Arrays;

public class InsertionSort {

	// Insertion Sort
	public static void main(String[] args) {
		int numbers[] = { 10, 8, 6, 5, 1, 7, 9 };
		for (int i = 0; i < numbers.length; i++) {
			int j = i;
			while (j > 0 && numbers[j] < numbers[j - 1]) {
				int esquerda = numbers[j - 1];
				numbers[j - 1] = numbers[j];
				numbers[j] = esquerda;
				j--;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

}
