package br.com.core.io.console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadingConsole {

	public static void main(String[] args) throws IOException {
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		File outputFile = new File("files\\keyboard-output-file.txt");
		FileOutputStream fos = new FileOutputStream(outputFile);
		OutputStreamWriter osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String line = br.readLine();
		while(line != null && !line.isEmpty()) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		br.close();
		bw.close();
	}
}
