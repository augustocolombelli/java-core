package br.com.core.io.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WritingTextFile {

	public static void main(String[] args) throws IOException {
		File outputFile = new File("files\\output-file.txt");
		OutputStream fileOutputStream = new FileOutputStream(outputFile);
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write("Printing line one");
		bufferedWriter.newLine();
		bufferedWriter.write("Printing line two");
		bufferedWriter.newLine();
		bufferedWriter.write("Printing line three");
		bufferedWriter.newLine();
		bufferedWriter.write("Printing line four");
		bufferedWriter.close();
	}
}
