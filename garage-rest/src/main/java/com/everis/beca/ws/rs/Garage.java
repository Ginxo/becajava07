package com.everis.beca.ws.rs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/garage")
public class Garage {

	static List<Car> cars = new ArrayList<Car>();
	
	OwnerService ownerService = new OwnerService();
	
	@GET
	@Path("/cars")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Car> getCars(@QueryParam("order")
	                         @DefaultValue("none") String order) {
		
		if(!"none".equals(order) && ("desc".equals(order) || "asc".equals(order))) {
			Collections.sort(cars);
			if("desc".equals(order)) {
				Collections.reverse(cars);
			}
		}
		
		return cars;
	}
	
	
	@GET
	@Path("/cars/{matricula}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response getCar(@PathParam("matricula") String matricula) {
		
		Car car = null;
		
		for(Car tmpCar: cars) {
			if(tmpCar.getMatricula().equals(matricula)) {
				car = tmpCar;
				break;
			}
		}
		
		Owner owner = ownerService.getOwner(car);
		
		Link link = ownerService.getLink(owner);
		
		return Response.status(200)
		        .entity(car)
		        .links(link)
		        .build();
		
	}
	
	@POST
	@Path("/cars")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCar(Car car){
		
		cars.add(car);
		
		return Response.status(201).entity(car).build();	
	 }
	
}