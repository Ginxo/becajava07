package com.everis.alicante.courses.becajava.examples;



public class Test {

		
	public Client cliente;
	
	public static void main(String[] args) {
		
		
		int entero= 3;

		String cadena1="hola";
		String cadena2="hola";
		
		String enteroString=String.valueOf(entero);
		
		String cadena3= new String("hola");
		String cadena4= new String("hola");
				
		Test test2 = null;
		Test test= new Test();
	
		Client[] arrayCliente= new Client[20];
		
		Client cliente= new Client();
		
		arrayCliente[0]=cliente;
		arrayCliente[5]=cliente;
		arrayCliente[10]=cliente;
		
			
		Object[] arrayObject= new Object[20];
		
		arrayObject[0]=arrayCliente;
				
		Client cliente1=new Client();
		cliente1.setName("JOSE JUAN");
		cliente1.setNif("46545467T");
		
		Client cliente2=new Client();
		cliente2.setName("JOSE JUAN");
		
		if (cadena1.equals(cadena2)) {
			System.out.println("son iguales");
		}
		else {
			System.out.println("no son iguales");
		}
		
		System.out.println(cliente1.hablar());
		
		if (cliente1 instanceof Persona) {
		
			System.out.println(true);
			
		}
		
		
		Persona p=new Persona();
		
		if (p instanceof Client) {
			
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		
		
		Persona persona= new Persona();
		persona.getVehiculo();
		
		Vehiculo vehiculo= new Vehiculo();
		persona.setVehiculo(vehiculo);
		
		Client cliente5= new Client();
		
		Persona persona5=cliente5;
		
		Client cliente6=(Client) persona5;
		
		Vehiculo vehiculo1= new Coche();		
		
		
		
	}
	
	
		
		
	
		
		

}
