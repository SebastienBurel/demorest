package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Employe;



@Path("/json/burel")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Employe getEmployeInJSON() {

		Employe employe = new Employe();
		employe.setNom("Burel");
		employe.setPrenom("Sebastien");

		return employe;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployeInJSON(Employe employe) {

		String result = "Employe sauvegardé : " + employe;
		return Response.status(201).entity(result).build();
		
	}
	
}