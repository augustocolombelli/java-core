package br.com.core.io.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterWithFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("files//file-writer-output");
		BufferedWriter bw = new BufferedWriter(fileWriter);
		bw.write("Writing line one...");
		bw.newLine();
		bw.newLine();
		bw.write("Writing line two...");
		bw.close();
	}
	
}
