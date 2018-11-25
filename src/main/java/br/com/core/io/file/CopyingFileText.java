package br.com.core.io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyingFileText {

	
	public static void main(String[] args) throws IOException {
		File inputFile = new File("files\\copy-input-file.txt");
		
		FileInputStream fis = new FileInputStream(inputFile);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		File outputFile = new File("files\\copy-output-file.txt");
		FileOutputStream fos = new FileOutputStream(outputFile);
		OutputStreamWriter osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String line = br.readLine();
		while(line != null) {
			bw.write("Line copied: ");
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		br.close();
		bw.close();
	}
	
	
}
