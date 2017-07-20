package com.everis.alicante.courses.becajava.examples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StringTest {

	public static void main(String[] args) throws ParseException {
		
		
		Calendar calendar1=new GregorianCalendar();
		
		Calendar calendar2= Calendar.getInstance();
		
//		System.out.println(calendar1);
		
//		System.out.println(calendar2);
		
		calendar1.set(Calendar.DAY_OF_YEAR, calendar1.get(Calendar.DAY_OF_YEAR)+60);
		
//		calendar1.add(Calendar.DAY_OF_YEAR, -60);
		
//		System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
//		System.out.println(calendar1.get(Calendar.MONTH));
		
//		System.out.println(calendar1.compareTo(calendar2));
		
//		DateFormat formatter= new SimpleDateFormat("EEEE dd MMMM yyyy kk:mm:ss");
		
		DateFormat formatter2= new SimpleDateFormat("dd/MM/yyyy");
		
//		System.out.println(formatter.format(calendar1.getTime()));
		
		String fecha="20/07/2017";
		
		Date date = formatter2.parse(fecha);
		
//		System.out.println(date);

	}

}
