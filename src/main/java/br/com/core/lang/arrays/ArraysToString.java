package br.com.core.lang.arrays;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = i;
		}
		
		//Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(Arrays.toString(numbers));
	}

}
