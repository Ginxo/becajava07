package com.everis.beca.ws;

import javax.xml.ws.Endpoint;

public class CalculatorPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/calculator", new CalculatorImpl());
	}

}
