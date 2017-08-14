package com.everis.beca.ws;

public class SuperClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationResult rs = new CalculatorImplService().getCalculatorImpl().add(10, 7);
		
		System.out.println(rs);
	}

}
