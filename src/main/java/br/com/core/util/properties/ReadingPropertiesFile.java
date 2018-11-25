package br.com.core.util.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
	
	public static void main(String[] args) throws IOException{
		Properties props = new Properties();
		props.load(new FileReader("files//file.properties"));
		
		String stringSample = props.getProperty("stringSample");
		String doubleSample = props.getProperty("doubleSample");
		String integerSample = props.getProperty("integerSample");
		
		System.out.println(stringSample);
		System.out.println(doubleSample);
		System.out.println(integerSample);
	}
	
}
