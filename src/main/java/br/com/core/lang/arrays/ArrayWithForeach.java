package br.com.core.lang.arrays;

public class ArrayWithForeach {

	public static void main(String[] args) {

		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 8;
		numbers[2] = 12;
		numbers[3] = 18;
		numbers[4] = 20;

		for (int x : numbers) {
			System.out.println("Number: " + x);
		}

	}

}
