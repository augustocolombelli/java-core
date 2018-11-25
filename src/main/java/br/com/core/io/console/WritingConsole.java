package br.com.core.io.console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WritingConsole {

	public static void main(String[] args) throws IOException {
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;
		OutputStreamWriter osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String line = br.readLine();
		while(line != null && !line.isEmpty()) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		}
		br.close();
		bw.close();
	}
}
