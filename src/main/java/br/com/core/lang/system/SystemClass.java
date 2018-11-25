package br.com.core.lang.system;

public class SystemClass {

	public static void main(String[] args) {
		runLineSeparator();
		runCurrentTimeMillis();
	}

	/**
	 * Return how many milliseconds since 01/01/1970
	 */
	private static void runCurrentTimeMillis() {
		long millisBefore = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			i++;
		}
		long millisAfter = System.currentTimeMillis();
		System.out.println("How many milliseconds to pass whole list? " + (millisAfter - millisBefore));
	}

	/**
	 * Special character used do create a new line independent of Operational System
	 */
	private static void runLineSeparator() {
		StringBuffer sampleText = new StringBuffer();
		sampleText.append("Line one");
		sampleText.append(System.lineSeparator());
		sampleText.append(System.lineSeparator());
		sampleText.append("Line two");
		System.out.println(sampleText.toString());
	}

}
