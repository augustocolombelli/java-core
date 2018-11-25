package br.com.core.nio.charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ConvertingCharsets {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String letter = "ç";
		System.out.println("Unicode value is: " + letter.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println("Default charset is: " + charset.displayName());

		System.out.println("================ UTF 16 ================");
		byte[] bytes = letter.getBytes(StandardCharsets.UTF_16);
		System.out.println("Bytes in UTF-16 is: " + bytes.length);
		System.out.println("Bits in UTF-16 is: " + Arrays.toString(bytes));
		String newLetter = new String(bytes, "windows-1252");
		System.out.println("Letter with a different charset: "+ newLetter);
		
		
		System.out.println("================ UTF 8 ================");
		bytes = letter.getBytes(StandardCharsets.UTF_8);
		System.out.println("Bytes in UTF-8 is: " + bytes.length);
		System.out.println("Bits in UTF-8 is: " + Arrays.toString(bytes));
		newLetter = new String(bytes, "windows-1252");
		System.out.println("Letter with a different charset: "+ newLetter);
		newLetter = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("Letter with a corrected charset: "+ newLetter);
		
		System.out.println("================ windows-1252 ================");
		bytes = letter.getBytes("windows-1252");
		System.out.println("Bytes in windows-1252 is: " + bytes.length);
		System.out.println("Bits in windows-1252 is: " + Arrays.toString(bytes));
		newLetter = new String(bytes, "windows-1252");
		System.out.println("Letter with a different charset: "+ newLetter);
		
		System.out.println("================ US-ASCII ================");
		bytes = letter.getBytes("US-ASCII");
		System.out.println("Bytes in US-ASCII is: " + bytes.length);
		System.out.println("Bits in US-ASCII is: " + Arrays.toString(bytes));
		newLetter = new String(bytes, "windows-1252");
		System.out.println("Letter with a different charset: "+ newLetter);
		
	}

}
