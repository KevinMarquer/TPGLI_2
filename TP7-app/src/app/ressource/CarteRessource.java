package fr.istic.tp2.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import fr.istic.tp2.test.testjpa.domain.Carte;
import fr.istic.tp2.dao.CarteDao;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/carte")
@Produces({"application/json", "application/xml"})
public class CarteRessource {

	CarteDao carteDao = new CarteDao();
	
	  @GET
	  @Path("/{petId}")
	  public Carte getCarteById(@PathParam("carteId") Long carteId)  {
	      // return pet
	      return new Carte();
	  }

	  @POST
	  @Consumes("application/json")
	  public Response addCarte(
	      @Parameter(description = "Carte a ajouter ", required = true) Carte carte) {
	    
	    return Response.ok().entity("SUCCESS").build();
	  }
	  
	  
	}
	
	

