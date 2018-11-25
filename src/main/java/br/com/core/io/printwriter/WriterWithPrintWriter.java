package br.com.core.io.printwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class WriterWithPrintWriter {

	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter("files//print-writer-output");
		pw.println("Printing line one");
		pw.println("Printing line two");
		pw.println("Printing line three");
		pw.println("Printing line four");
		pw.close();
	}
	
}
