package br.com.core.io.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadingSocket {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket();
		InputStream fis = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		while (line != null && !line.isEmpty()) {
			line = br.readLine();
		}
		br.close();
		socket.close();
	}

}
