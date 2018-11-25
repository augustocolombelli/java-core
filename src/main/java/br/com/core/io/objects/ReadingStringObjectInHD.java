package br.com.core.io.objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingStringObjectInHD {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream inputObject = new ObjectInputStream(new FileInputStream(new File("files//object.bin")));
		String object = (String) inputObject.readObject();
		inputObject.close();
		System.out.println(object);
	}
}
