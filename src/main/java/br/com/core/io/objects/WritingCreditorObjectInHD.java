package br.com.core.io.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingCreditorObjectInHD {

	public static void main(String[] args) throws IOException {
		Creditor creditor = new Creditor();
		creditor.setId(10);
		creditor.setName("Hector MCA");
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(new File("files//creditor.bin")));
		objectOutput.writeObject(creditor);
		objectOutput.close();
		
	}
	
}
