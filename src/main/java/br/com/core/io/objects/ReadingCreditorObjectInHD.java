package br.com.core.io.objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingCreditorObjectInHD {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream inputObject = new ObjectInputStream(new FileInputStream(new File("files//creditor.bin")));
		Creditor creditor = (Creditor) inputObject.readObject();
		inputObject.close();
		System.out.println("Name: " + creditor.getName());
		System.out.println("Id: " + creditor.getId());
	}
}
