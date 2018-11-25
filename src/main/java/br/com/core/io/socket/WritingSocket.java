package br.com.core.io.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class WritingSocket {

	
	public static void main(String[] args) throws IOException {
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
	
		Socket outSocket = new Socket();
		OutputStream fos = outSocket.getOutputStream();
		OutputStreamWriter osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String line = br.readLine();
		while(line != null) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		br.close();
		bw.close();
		outSocket.close();
	}
}
