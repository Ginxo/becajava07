package com.everis.alicante.becajava.garage.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.swing.text.Utilities;

import com.everis.alicante.becajava.garage.domain.Cliente;
import com.everis.alicante.becajava.garage.domain.Garaje;
import com.everis.alicante.becajava.garage.domain.Moto;
import com.everis.alicante.becajava.garage.domain.Plaza;
import com.everis.alicante.becajava.garage.domain.PlazaCoche;
import com.everis.alicante.becajava.garage.domain.PlazaMoto;
import com.everis.alicante.becajava.garage.domain.Reserva;
import com.everis.alicante.becajava.garage.domain.Usuario;

public class GarageTest {
	
	

	public static void main(String[] args) throws ParseException, IOException {
		
		
		Garaje garaje= new Garaje();
		
		List<Reserva> reservas= new ArrayList<>();	
		
		
		List<Plaza> plazas= new ArrayList<Plaza>();
		
		for (int i = 0; i < 15; i++) {			
			PlazaCoche plazaTmp=new PlazaCoche();
			plazaTmp.setNumeroPlaza(i+1);
			plazaTmp.setPrecio(100);
			plazaTmp.setMetrosCuadrados(4);			
			plazas.add(plazaTmp);			
		}		
		for (int i = 15; i < 20; i++) {			
			PlazaMoto plazaTmp=new PlazaMoto();
			plazaTmp.setNumeroPlaza(i+1);
			plazaTmp.setPrecio(75);
			plazaTmp.setMetrosCuadrados(4);			
			plazas.add(plazaTmp);			
		}		
		garaje.setPlazas(plazas);
		
		//hacer una reserva
		
		Cliente cliente= new Cliente("JOSE");
		Moto vehiculo= new Moto();
		vehiculo.setMatricula("4567 HJG");
		
		//quiere reservar la plaza 15
		
		  Plaza plaza = plazas.get(14);
		  vehiculo.setCliente(cliente);
		  plaza.setVehiculo(vehiculo);
		  
		  Reserva reserva= new Reserva();
		  reserva.setCliente(cliente);
		  reserva.setVehiculo(vehiculo);
		  reserva.setPlaza(plaza);
		  reserva.setFechaReserva(Calendar.getInstance().getTime());
		  
		  reservas.add(reserva);
		
		//imprimir plazas
		  
		  for (Plaza plazaTemp : plazas) {
			System.out.println(plazaTemp);
		}
		  
		  System.out.println("**********************************************************");
		  
		//imprimir las reservas
		  
		  System.out.println(reservas);		  
		  
		  String cadena="HOLA , CARACOLA";
		  
		  System.out.println(cadena);
		  
		  cadena=cadena.replace('H', 'M');
		  
		  System.out.println(cadena.contains("COLA"));
		  
		  String cadena2= "1;3;4;5;6";
		  
		  String[] var = cadena2.split(";");
		  
		  System.out.println(cadena.indexOf(','));
		  
		  Date date= new Date();
		  
		  System.out.println(date.getTime());
		  
		  Calendar calendar= new GregorianCalendar();
		  
		  System.out.println(calendar.getTime());
			  
		  calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR)+5);
		  
		  System.out.println(calendar.getTime());
		  
		  System.out.println(getDayOfTheWeek("2018"));
		  
		  
		  String fecha="10/02/2017 12:32";
		  
		  SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy hh:mm");
		  
		  Date resultado = formatter.parse(fecha);
		  
		  SimpleDateFormat formatter2=new SimpleDateFormat("EEEEEEE MM yyyy");
		  
		  System.out.println( formatter2.format(resultado));
		  
		
		  File fichero= new File("C:\\prueba.txt");
		  
		  FileReader reader= new FileReader(fichero);
		  
		  BufferedReader buffer= new BufferedReader(reader);
		  		  			 
		  String line;			 
				
			while((line=buffer.readLine())!=null){				  
				System.out.println(line);	
			}			
					
			buffer.close();		  
		  
		 FileWriter writter= new FileWriter(fichero,true);
		 writter.write("ESTO ES UN TEST");		
		 writter.close();
			
	}
	
	//metodo q devuelva en que cae el dia que queramos del año que viene
	
	public static String getDayOfTheWeek(String year) {
					
			Calendar calendario=Calendar.getInstance();				
			calendario.set(Calendar.YEAR, Integer.parseInt(year));	
			calendario.set(Calendar.MONTH,4);
			calendario.set(Calendar.DAY_OF_MONTH,1);
			
			int dia=calendario.get(Calendar.DAY_OF_WEEK);
			
			Calendar calendarioHoy=Calendar.getInstance();
			
			Calendar calendario3=Calendar.getInstance();
					
			calendario3.setTimeInMillis(calendario.getTimeInMillis()-calendarioHoy.getTimeInMillis());		
			
			System.out.println(calendario3.get(Calendar.DAY_OF_YEAR));
			
			System.out.println(calendarioHoy.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("ES")));
		
			return null;
			
		}

}
