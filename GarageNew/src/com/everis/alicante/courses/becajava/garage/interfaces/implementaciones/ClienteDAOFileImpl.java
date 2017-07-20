package com.everis.alicante.courses.becajava.garage.interfaces.implementaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.interfaces.ClienteDAO;

public class ClienteDAOFileImpl implements ClienteDAO {

	@Override
	public Map<String,Cliente> readClientes() throws IOException {
							
			 Map<String,Cliente> clientes= new TreeMap<String,Cliente>();		 
			
			 String linea;
			 
			 File file= new File("src/resources/Clientes.txt");
			 FileReader reader= new FileReader(file);
			 BufferedReader  buffer= new BufferedReader(reader);
			 		 
			 while((linea=buffer.readLine())!=null){				  
				
				if(!linea.contains("NIF")||linea.isEmpty()){
					
					Cliente clienteTemp= new Cliente();	
					
					String[] temp= linea.split(";");
					
					clienteTemp.setNif(temp[0]);
					clienteTemp.setNombreCompleto(temp[1]);
					
											
					clientes.put(clienteTemp.getNif(),clienteTemp);
				
				}
				
			 }
				 
			 reader.close();		
			 	  	
			return  clientes;	
	}

	@Override
	public void createCliente(Cliente cliente) throws IOException {
		
		 File file= new File("src/resources/Clientes.txt");
		 FileWriter writer= new FileWriter(file,true);
		 BufferedWriter  buffer= new BufferedWriter(writer);
		
		 buffer.newLine();		 
		 
		 buffer.write(cliente.convierteAFormatoTxt());		
		
		 buffer.close();
		
	}

	@Override
	public Cliente readCliente(String nif) throws IOException {
		 
		 Cliente clienteTemp=null;			
		 String linea;
		 
		 File file= new File("src/resources/Clientes.txt");
		 FileReader reader= new FileReader(file);
		 BufferedReader  buffer= new BufferedReader(reader);
		 		 
		 while((linea=buffer.readLine())!=null){				  
			
			if(!linea.contains("NIF")||linea.isEmpty()){
			
				String[] temp= linea.split(";");
			
				if(nif.equals(temp[0])){
										
					clienteTemp= new Cliente();						
					clienteTemp.setNif(temp[0]);
					clienteTemp.setNombreCompleto(temp[1]);			
					
				}
						
			}
			
		 }
			 
		 reader.close();		
		 	  	
		return  clienteTemp;	
	}

	@Override
	public void deleteCliente(String nif) {
		// TODO Auto-generated method stub
		
	}

}
