import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControladorGarajeConArrays implements ControladorGaraje{

	@Override
	public void listarPlazasLibres() {
		
		List<Plaza> plazaslibres= new ArrayList<Plaza>();
		
		Plaza[] plazas=GarageMain.getGaraje().getPlazas();
		
		for (int i = 0; i < plazas.length; i++) {
			Plaza plaza = plazas[i];
			
			if(plaza.getLibre()){
				plazaslibres.add(plaza);				
			}					
		}		
	
		//listar por pantalla
		for (Plaza plaza : plazaslibres) {			
			System.out.println(plaza);			
		}
		
	}

	@Override
	public void listarPlazasOcupadas() {
		
		List<Plaza> plazaslibres= new ArrayList<Plaza>();
		
		Plaza[] plazas=GarageMain.getGaraje().getPlazas();
		
		for (int i = 0; i < plazas.length; i++) {
			Plaza plaza = plazas[i];
			
			if(!plaza.getLibre()){
				plazaslibres.add(plaza);				
			}					
		}		
	
		//listar por pantalla
		for (Plaza plaza : plazaslibres) {			
			System.out.println(plaza);			
		}
		
	}

	@Override
	public boolean reservarPlaza() {
		
		//logica de crear cliente
		
		Cliente cliente= new Cliente();
		
		//vamos a escribir por pantalla un menu para meter los datos del cliente
		
		System.out.println("Inserte el nombre completo del Cliente");
		
		Scanner in = new Scanner(System.in);		
		cliente.setNombreCompleto(in.nextLine());
		
		System.out.println("Insert el nif del cliente");		
		in = new Scanner(System.in);
		cliente.setNif(in.nextLine());
		
		Vehiculo vehiculo = null;
		
		System.out.println("Tipo de vehiculo del propietario:");	
		System.out.println("1: Coche:");	
		System.out.println("2: Moto");	
		System.out.println("3: Camion");
		
		in = new Scanner(System.in);
		
		
		switch (in.nextInt()) {
			case 1:
				 vehiculo= new Coche();
				break;
			case 2:
				 vehiculo= new Motocicleta();
				break;
			case 3:
				vehiculo= new Camion();
				break;
	
			default:
				break;
		}
		
		System.out.println("Inserte la matricula del vehiculo:");
		in = new Scanner(System.in);
		vehiculo.setMatricula(in.nextLine());
				
		cliente.setVehiculo(vehiculo);
		
		boolean hayplaza=false;
		Garaje garaje=GarageMain.getGaraje();		
		Plaza[] plazas=garaje.getPlazas();
		
		for (int i = 0; i < plazas.length; i++) {
			
			Plaza plaza = plazas[i];
			
			if (plaza.getLibre()&&vehiculo instanceof Aparcable) {				
				plaza.setCliente(cliente);				
				hayplaza=true;
				return hayplaza;
			}				
		}
		
		return hayplaza;
		
	}

}
