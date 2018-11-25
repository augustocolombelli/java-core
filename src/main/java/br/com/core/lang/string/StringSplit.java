package br.com.core.lang.string;

public class StringSplit {

	public static void main(String[] args) {
		String string = "One,Two,Three,,Four";
		String[] splittedString = string.split(",");
		for (int i = 0; i < splittedString.length; i++) {
			System.out.println("Splitted " + i + " :" + splittedString[i]);
		}
	}

}
