package com.everis.beca.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Calculator {
	
	@WebMethod
	int add(int a, int b);
	
	@WebMethod
	double addMejor(int [] numbers);

}
