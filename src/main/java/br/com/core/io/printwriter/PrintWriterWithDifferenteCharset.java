package br.com.core.io.printwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterWithDifferenteCharset {

	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter("files//print-writer-output", "UTF-8");
		pw.println("Printing line one");
		pw.println("Printing line two");
		pw.println("Printing line three");
		pw.println("Printing line four");
		pw.close();
	}
	
}
