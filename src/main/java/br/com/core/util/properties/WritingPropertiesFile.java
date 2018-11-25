package br.com.core.util.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WritingPropertiesFile {

	public static void main(String[] args) throws IOException{
		Properties prop = new Properties();
		prop.setProperty("valueA", "Hello");
		prop.setProperty("valueB", "Value B");
		prop.setProperty("valueC", "C Value");
		
		prop.store(new FileWriter("files//file-created.conf"), "Example configuration");
	}
	
}
