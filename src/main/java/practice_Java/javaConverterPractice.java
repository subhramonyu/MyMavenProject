package practice_Java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javaConverterPractice {
	
	
	public static void dateToString() throws ParseException {
		Date d =Calendar.getInstance().getTime();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
		String s = dateformat.format(d);
		System.out.println(s);	
	}
	
	
	public static void stringToDate() throws ParseException {
		String s = "31/12/2019";
		Date d = new SimpleDateFormat("dd/mm/yyyy").parse(s);
		System.out.println(d);
	}

	public static void stringToInt(String s) {
		int i = Integer.parseInt(s);
		System.out.println(i);
	}
	

	
	public static void main(String[] args) throws ParseException{
		
		//stringToInt("122");
		String s = String.valueOf('c');
		System.out.println(s);
		
	}
	
	
	
}
