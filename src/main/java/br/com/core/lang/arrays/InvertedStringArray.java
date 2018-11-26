package br.com.core.lang.arrays;

public class InvertedStringArray {

	public static void main(String[] args) {
		String text = "Socorram-me, subi no ônibus em Marrocos";
		
		String[] words = text.split(" ");
		StringBuilder invertedPhrase = new StringBuilder();
		for(int i = words.length-1; i >= 0; i--) {
			invertedPhrase.append(words[i]);
			invertedPhrase.append(" ");
		}
		System.out.println(invertedPhrase);
	}
	
}
