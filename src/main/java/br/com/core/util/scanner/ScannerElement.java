package br.com.core.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerElement {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("files//creditors.csv"));
		while(scanner.hasNextLine()) {
			Scanner scannerLine = new Scanner(scanner.nextLine());
			scannerLine.useDelimiter(",");
			scannerLine.useLocale(Locale.US);
			
			int id = scannerLine.nextInt();
			String name = scannerLine.next();
			double value = scannerLine.nextDouble();
			
			System.out.print("Id: "+id+", Name: "+name+", Value: "+value);
			System.out.println();
			scannerLine.close();
		}
		scanner.close();
	}
	
}
