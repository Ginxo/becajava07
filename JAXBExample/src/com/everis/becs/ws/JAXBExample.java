package com.everis.becs.ws;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

	public static void main(String[] args) throws Exception {
		
		Customer customer = new Customer();
		
		customer.setName("Allen");
		customer.setAge(40);
		customer.setId(1);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		jaxbMarshaller.marshal(customer, System.out);
		
		
		String xmlCustomer = "<customer id=\"1\">\r\n" + 
				"    <age>20</age>\r\n" + 
				"    <name>Allen</name>\r\n" + 
				"</customer>\r\n";
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		InputStream stream = new ByteArrayInputStream(xmlCustomer.getBytes(StandardCharsets.UTF_8));
		
		Customer customer1 = (Customer) jaxbUnmarshaller.unmarshal(stream);
	}
	
}
