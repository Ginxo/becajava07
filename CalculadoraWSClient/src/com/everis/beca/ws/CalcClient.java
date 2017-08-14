package com.everis.beca.ws;

import java.rmi.RemoteException;

public class CalcClient {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		CalculationResult result = new CalculatorImplProxy().getCalculatorImpl().add(10, 20);
		
		System.out.println(result);
	}

}
