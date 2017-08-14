package com.everis.beca.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface Calculator {

	@WebMethod
	CalculationResult add(double a, double b);
	
}
