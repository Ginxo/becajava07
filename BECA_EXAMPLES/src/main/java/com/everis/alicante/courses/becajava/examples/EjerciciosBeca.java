package com.everis.alicante.courses.becajava.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EjerciciosBeca {
	
	
	public static void main(String[] args) {
		
	
		System.out.println(Utilidades.devuelvePares(1, 20));
		
		List<Integer> lista=new ArrayList<Integer>();
		lista.add(1);
		lista.add(5);
		lista.add(4);
		lista.add(7);
		lista.add(3);
		lista.add(2);
		lista.add(8);
		lista.add(9);
		
		List<String> lista2= new ArrayList<>();
		
		lista2.add("A");
		lista2.add("A");
		lista2.add("A");
		lista2.add("B");
		lista2.add("C");
		lista2.add("D");
		lista2.add("D");
				
		
		System.out.println(Utilidades.ordenarLista(lista));
		
		System.out.println(Utilidades.devuelvePares(lista));	
		
		System.out.println(Utilidades.devuelveDistintos(lista2));
		
		System.out.println(Collections.frequency(lista2, "A"));
		
		
		Map<String,Client> clientes= new HashMap<String,Client>();
		
		Client cliente= new Client("JOSE", "654854758");
	
		clientes.put("58569854T", cliente);
		clientes.put("48774846A", new Client("DARIO", "654534345"));		
		clientes.put("67589834A", new Client("LUIS", "65789689"));
		clientes.put("55434534B", new Client("MARIA", "632423423"));
		clientes.put("34456456C", new Client("CARMEN", "678899665"));			
				
		Client cliente5=Utilidades.getClienteFromMap("DARIO", clientes);		
		
		ArrayList lista3= new ArrayList<>();
		Set set3= new HashSet<>();
		
		
	}
	

	

}
