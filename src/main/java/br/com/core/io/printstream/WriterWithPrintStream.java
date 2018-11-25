package br.com.core.io.printstream;

import java.io.IOException;
import java.io.PrintStream;

public class WriterWithPrintStream {

	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("files//print-stream-output");
		ps.println("Printing line one");
		ps.println("Printing line two");
		ps.println("Printing line three");
		ps.println("Printing line four");
		ps.close();
	}
	
}
