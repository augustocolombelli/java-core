package br.com.core.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		File file = new File("files\\creditors-utf8.csv");
		InputStream fileInputStream = new FileInputStream(file);
		Reader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String line = bufferedReader.readLine();
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
	}
	
}
