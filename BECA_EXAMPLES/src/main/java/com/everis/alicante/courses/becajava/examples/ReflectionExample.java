package com.everis.alicante.courses.becajava.examples;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException {
		
		Example objectoDeMiClase= new Example();
		
		Class<? extends Example> objetoDeClassConInfoDeMiClase = objectoDeMiClase.getClass();		
		
		System.out.println(objetoDeClassConInfoDeMiClase);
		
		//Obtener el Class directamente de un objeto (Recordatorio: un objeto de tipo String válido es un texto entre comillas)
		Class classDelTexto = "Un texto".getClass();

	//	System.out.println(classDelTexto);
		
		Integer numero = 5;
		Class classDelNumero = numero.getClass();

//		System.out.println(classDelNumero);
		
		
		//Para tipos primitivos tenemos que usar “.class” 
	
		//También podemos obtener una clase desde un nombre completamente cualificado (fully-quailified name); esto es, el nombre del paquete donde está nuestra clase, seguido del nombre de la clase
//		Class c = Class.forName("com.everis.alicante.courses.becajava.examples.Example");
		
		
//		System.out.println(c);
		
		//Obtener el nombre de la clase
		String nombreDeLaClase = objetoDeClassConInfoDeMiClase.getSimpleName();
		System.out.println(nombreDeLaClase);

		//si queremos ver todos los fields que tiene (publicos)
		
		Field[] campos = objetoDeClassConInfoDeMiClase.getFields();
		
		//Si queremos obtener una variable pública
		Field variablePublica = objetoDeClassConInfoDeMiClase.getField("numero");
				
		//Si queremos obtener una variable, sea privada o no
		Field variablePrivada = objetoDeClassConInfoDeMiClase.getDeclaredField("texto");
		
//		System.out.println(variableInt);
		
		//Si queremos obtener un array con todas las variables públicas de nuestra clase
		Field[] todasLasVariables = objetoDeClassConInfoDeMiClase.getFields();

		//Si queremos obtener todas las variables, independientemente de si son privadas o no
		Field[] todasLasVariablesDeclaradas = objetoDeClassConInfoDeMiClase.getDeclaredFields();
		
//		System.out.println(todasLasVariables);
		
		//Obtener funciones
		
		//Si queremos obtener un método público. Si tiene parámetros podremos pasar cada uno de sus tipos.class  en orden después del nombre
		Method metodoGetString = objetoDeClassConInfoDeMiClase.getMethod("getNumero");

		//Si queremos obtener un método, sea privado o no. Si tiene parámetros podremos pasar cada uno de sus tipos.class en orden después del nombre
		Method metodoGetInt = objetoDeClassConInfoDeMiClase.getDeclaredMethod("getTexto");

		//Si queremos obtener un array con todas las variables públicas de nuestra clase
		Method[] todosLosMetodos = objetoDeClassConInfoDeMiClase.getMethods();

		//Si queremos obtener todos los métodos, independientemente de si son privados o no
		Method[] todosLosMetodosDeclarados = objetoDeClassConInfoDeMiClase.getDeclaredMethods();
		
		//Si queremos obtener un array con todos los constructores publicos de nuestra clase
		Constructor[] constructores = objetoDeClassConInfoDeMiClase.getConstructors();

		//Si queremos obtener todos los métodos, independientemente de si son privados o no
		Constructor[] todosLosConstructores = objetoDeClassConInfoDeMiClase.getDeclaredConstructors();
		
		
		//obtener el valor de una variable
		
		//Si queremos obtener una variable
		Field variableNumero = objetoDeClassConInfoDeMiClase.getField("numero");
		double numeroObtenido = (double) variableNumero.get(objectoDeMiClase);
		
		//que pasa con el private???
//		Field variableString = objetoDeClassConInfoDeMiClase.getField("texto");
		//String textoObtenido = (String) variableString.get(objectoDeMiClase);
		
		//tenemos que trampear
		
		Field variableString = objetoDeClassConInfoDeMiClase.getDeclaredField("texto");		
		variableString.setAccessible(true);
		String textoObtenido = (String) variableString.get(objectoDeMiClase);
	}

}
