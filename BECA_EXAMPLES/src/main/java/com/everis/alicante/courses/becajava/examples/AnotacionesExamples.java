package com.everis.alicante.courses.becajava.examples;

import java.lang.reflect.Field;

public class AnotacionesExamples {

	public static void main(String[] args) {
		
		
		ClaseConAnotacion ejemplo= new ClaseConAnotacion();		
		
		 Field[] campos= ejemplo.getClass().getDeclaredFields();
		 for(Field campo: campos) {
		 
		 MiAnotacion anotacion=campo.getAnnotation(MiAnotacion.class);
		 System.out.println("Nombre :" +anotacion.campo());
		 System.out.println("Tipo :"+ anotacion.tipo());
		 
		 }
		
	}

}
