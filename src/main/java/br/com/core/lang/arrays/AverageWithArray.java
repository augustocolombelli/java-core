package br.com.core.lang.arrays;

public class AverageWithArray {

	public static void main(String[] args) {
		int numbers[] = new int[5];
		numbers[0] = 5;
		numbers[1] = 15;
		numbers[2] = 8;
		numbers[3] = 12;
		numbers[4] = 10;

		int total = 0;
		for (int x : numbers) {
			total += x;
		}
		int average = total / numbers.length;
		System.out.println("The average is: "+average);
	}

}
