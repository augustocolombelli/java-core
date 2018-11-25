package br.com.core.util.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerWithCharset {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(new File("files//creditors-utf8.csv"), "UTF-8");
		while(scanner.hasNextLine()) {
			Scanner lineScanner = new Scanner(scanner.nextLine());
			lineScanner.useDelimiter(",");
			lineScanner.useLocale(Locale.US);
			
			int id = lineScanner.nextInt();
			String name = lineScanner.next();
			double value = lineScanner.nextDouble();
			
			System.out.format("%d %s %f", id, name, value);
			lineScanner.close();
		}
		scanner.close();
	}
	
}
