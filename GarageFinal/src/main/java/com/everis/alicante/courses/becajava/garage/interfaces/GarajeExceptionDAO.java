package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.IOException;

import com.everis.alicante.courses.becajava.garage.domain.GarajeException;

public interface GarajeExceptionDAO {
	
	public void create(GarajeException ex) throws IOException;

}
