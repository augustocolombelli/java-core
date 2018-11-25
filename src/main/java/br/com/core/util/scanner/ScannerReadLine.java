package br.com.core.util.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReadLine {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(new File("files//creditors.csv"));
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);	
		}
		scanner.close();
	}
	
}
