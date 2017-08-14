package com.everis.beca.spring.boot.garageboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/garage")
public class Garage {
	
	private static List<Car> cars = new ArrayList<>();
	
	{
		cars.add(new Car("1002 GRF", "WHITE"));
		cars.add(new Car("1003 GRF", "BLACK"));
	}

	@RequestMapping(path="/cars", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Car> getCars(@RequestParam(value="order", defaultValue="none") String order) {
		
		if(!"none".equals(order) && ("desc".equals(order) || "asc".equals(order))) {
			Collections.sort(cars);
			if("desc".equals(order)) {
				Collections.reverse(cars);
			}
		}
		
		return cars;
	}

}