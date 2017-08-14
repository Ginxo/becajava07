package com.everis.beca.ws;

public class CalculationResult {

	double result;
	String calculationDifficulty;
	
	public String getCalculationDifficulty() {
		return calculationDifficulty;
	}
	public double getResult() {
		return result;
	}
	public void setCalculationDifficulty(String calculationDifficulty) {
		this.calculationDifficulty = calculationDifficulty;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
}
