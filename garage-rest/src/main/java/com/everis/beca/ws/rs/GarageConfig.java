package com.everis.beca.ws.rs;

import org.glassfish.jersey.server.ResourceConfig;

public class GarageConfig extends ResourceConfig {
	
	public GarageConfig() {
		packages("com.everis.beca.ws.rs");
	}
}
