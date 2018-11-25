package br.com.core.lang.string;

import java.util.Locale;

public class StringFormat {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		String text = String.format("%d %s %f %s", 1, "Two", 3.4, "Five");
		System.out.println(text);
		
		// Using locale
		String textWithLocale = String.format(Locale.US,"%d %s %f %s", 1, "Two", 3.4, "Five");
		System.out.println(textWithLocale);
		
		//Format a Integer value - Output: 25 -> 0025
		System.out.println(String.format("%04d", 25));

		//Format a Float value - Output: 22.4 -> 22,400
		System.out.println(String.format("%06.3f", 22.4));
	}

}
