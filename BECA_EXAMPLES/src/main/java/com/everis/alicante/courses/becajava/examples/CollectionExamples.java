package com.everis.alicante.courses.becajava.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import com.everis.alicante.courses.becajava.garage.domain.Plaza;

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
		
		col2.add("Pedro");
		col2.add("Maria");
		col2.add("Maria1");
		col2.add("Maria2");
		col2.add("Maria3");
		col2.add("Maria4");
		col2.add("Pedro");
		
		System.out.println(col2);
		
		
       		
       	List<Name> names= new ArrayList<Name>();
       	names.add(new Name("John", "Lennon"));
       	names.add(  new Name("Karl", "Marx"));
       	names.add(new Name("Groucho", "Marx"));
       	names.add( new Name("Oscar", "Grouch"));
       		
       	
        Collections.sort(names);
        
        System.out.println(names);

        Map mapa1= new HashMap<>();
        
        Map mapa2= new TreeMap<>();
        
        mapa1.put("48546454T", new Plaza());
        mapa1.put("58523454T", new Plaza());
        mapa1.put("48523454T", new Plaza());
        
        System.out.println(mapa1);
        
        mapa2.put("48546454T", new Plaza());
        mapa2.put("58523454T", new Plaza());
        mapa2.put("48523454T", new Plaza());
        
        for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			
        	Name name = (Name) iterator.next();
			System.out.println(name.getName());
		}
        
        for (Name name : names) {
			
        	System.out.println(name.getName());
		}
		
        System.out.println(mapa2);
		
	}

}
