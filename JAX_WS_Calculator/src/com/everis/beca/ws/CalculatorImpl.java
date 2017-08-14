package com.everis.beca.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.everis.beca.ws.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public double addMejor(int[] numbers) {
		
		int sum = 0;
		
		for(int i : numbers) {
			sum += i;
		}
		
		return sum;
	}

}
