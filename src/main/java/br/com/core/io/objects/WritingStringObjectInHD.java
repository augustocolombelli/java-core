package br.com.core.io.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingStringObjectInHD {
	
	public static void main(String[] args) throws IOException{
		String name = "Some name example";
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(new File("files//object.bin")));
		objectOutput.writeObject(name);
		objectOutput.close();
	}

}
