package br.com.core.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSSZ");
		
		// Print first date and times
		Date date = new Date();
		date = sdf.parse("01-01-1970 00:00:00.000-0000");
		System.out.println(date.getTime());
		
		
	}
	
	
}
