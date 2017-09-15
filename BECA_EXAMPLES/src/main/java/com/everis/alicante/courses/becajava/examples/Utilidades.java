package com.everis.alicante.courses.becajava.examples;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utilidades {
	
	
	public static String devuelvePares(int numero1,int numero2) {
		
		String resultado="";
		
		for (int i = numero1; i <=numero2; i++) {
			
			if(i%2==0) {
				resultado=resultado.concat(i+",");		
			}
			
		}
		
		return resultado;
		
	}
	
	public static List<Integer> ordenarLista(List<Integer> lista){
		
		Collections.sort(lista);
		
		return lista;
		
		
	}
	
	public static List<Integer> devuelvePares(List<Integer> lista){
		
		List<Integer> resultado=new ArrayList<Integer>();
		
		for (Integer contenido : lista) {
			
			if(contenido%2==0) {
				resultado.add(contenido);
			}			
		}	
		
		return resultado;
	}
	
	
	public static Collection devuelveDistintos(Collection valores) {
		
		Set resultado=new HashSet<>();
		
		resultado.addAll(valores);
						
		return resultado;
		
		
	}
	
	public static Client getClienteFromMap(String nombreCliente,Map<String,Client> clientes) {		
			
		Collection<Client> valores = clientes.values();
	
		for (Client client : valores) {
			
			if(client.getName().equals(nombreCliente)) {
				
				return client;
			}
			
		}
		
		return null;
		
		
	}
	
	
	
	
	

}
