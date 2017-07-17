package com.everis.becajava;

import java.util.Scanner;

public class GarajeMain {
	
	static Garaje garaje;
	
	static ControladorGaraje controlador;
	
	public static void main(String[] args) {
	//iniciarlizar los componentes de la  aplicacion
	
		//5 clientes
	
		//5 vehiculos
	
		//30 plazas de garaje
	
		//1 garaje
	inicializarComponentes();
	
	iniciarAplicacion();
}

	private static void iniciarAplicacion() {
		
		System.out.println("Bienvenido a nuestro garaje, seleccione una opcion");
		System.out.println("1:Listar Plazas Garaje Libre");
		System.out.println("2:Listar Plazas Garaje Ocupadas");
		System.out.println("3:Calcular Ingresos Mensuales");

		
		Scanner in = new Scanner(System.in);	
		Integer opcion = in.nextInt();
		
		boolean resultado=false;
		
		System.out.println("Ha elegido la opcion : " + opcion);
		
		switch (opcion) {
		case 1:
			
			controlador.listarPlazasLibres();
			break;
			
		case 2:
			
			controlador.listarPlazasOcupadas();
		
		case 3:
			
			resultado=controlador.reservarPlaza();
			break;
		}
	
	if (opcion==3&&resultado) {
		System.out.println("Se ha reservado su plaza");
	}else if(opcion==3){
		System.out.println("No hay plazas disponibles");
	}

	iniciarAplicacion();
	in.close();
	}
	
//iniciar aplicacion o listar menu

public static void inicializarComponentes() {
	

	garaje = new Garaje();
	
	Plaza[] plazas = new Plaza[30];
	
	for (int i = 1; i < plazas.length; i++) {
		
		Plaza plazaTemp = new Plaza();
		plazaTemp.setNumeroPlaza(i+1);
		
		if (i<10) {
			
			plazaTemp.setPrecio(50);
			
		} else if (i<20){
			
			plazaTemp.setPrecio(75);

		} else {
			
			plazaTemp.setPrecio(100);
			
		}
		
		plazas[i] = plazaTemp;		
	}
	garaje.setPlazas(plazas);
	
	controlador = new ControladorGarajeConArrays();
	
}

	

public static Garaje getGaraje() {
	return garaje;
}


public void setGaraje(Garaje garaje) {
	this.garaje = garaje;
}
}