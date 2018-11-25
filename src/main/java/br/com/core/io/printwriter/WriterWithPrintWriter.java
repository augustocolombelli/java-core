package br.com.core.io.printwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class WriterWithPrintWriter {

	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter("files//print-writer-output-utf8");
		pw.println("José");
		pw.println("João");
		pw.println("Mário");
		pw.println("Juca");
		pw.close();
	}
	
}
