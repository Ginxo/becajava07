
public class GenericidadExample {

	
	public static void main(String[] args) {
		
		
		//PROBLEMA
		Contenedor contenedor = new Contenedor ();
		contenedor.setContenido("hola");
		String valor=(String) contenedor.getContenido();
		
		// Error de casting en tiempo de ejecución.		
//		Deposito deposito=(Deposito) contenedor.getContenido();
		
		ContenedorGenerico<String> contenedorGenerico1 = new ContenedorGenerico<String>();		
		contenedorGenerico1.setContenido("hola");		
		String valor1=(String) contenedorGenerico1.getContenido();
		
		ContenedorGenerico<Deposito> contenedorGenerico2 = new ContenedorGenerico<Deposito>();		
		contenedorGenerico2.setContenido(new Deposito());		
		Deposito valor2=(Deposito) contenedor.getContenido();
		
		
		
	}
	
}
