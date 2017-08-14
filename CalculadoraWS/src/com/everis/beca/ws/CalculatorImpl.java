package com.everis.beca.ws;

import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class CalculatorImpl implements Calculator {

	@Override
	@WebResult(name="calcResultado")
	public CalculationResult add(double a, double b) {
		
		CalculationResult result = new CalculationResult();
		result.setResult(a+b);
		result.setCalculationDifficulty("FACIL");
		
		return result;
	}
	
}
