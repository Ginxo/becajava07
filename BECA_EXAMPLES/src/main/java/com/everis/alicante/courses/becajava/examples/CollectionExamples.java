package com.everis.alicante.courses.becajava.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionExamples {

	public static void main(String[] args) {
	
		
		//LIST
		
		List arraylist= new ArrayList<>();
		List linkedlist= new LinkedList<>();
		List vector= new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			
			Example ex= new Example();
			ex.setNumero(i);
			
			arraylist.add(ex);			
			linkedlist.add(ex);			
			vector.add(ex);
		}
		
		
		System.out.println(arraylist);
		System.out.println(linkedlist);
		System.out.println(vector);
		
		//metodos de linked list
		((LinkedList<Object>)(linkedlist)).addFirst(new Example());
		((LinkedList<Object>)(linkedlist)).getLast();
		
		
		Collection<String > col1= new ArrayList<>();
		Collection<String > col2= new HashSet();
//		Collection<String> col3= new HashMap();
		
	}

}
