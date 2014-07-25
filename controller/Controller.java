package at.da.rest.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{{MODELNAME}}s")
public class {{MODELNAME}}Controller {
	
	@Context
	public HttpServletResponse response;
	@Context
	public HttpServletRequest request;

	/****************************************
	*
	*	{{MODELNAME}} Collection
	*
	****************************************/

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response get() {
		{{MODELNAME}}Container container;

		// load your {{MODELNAME}}'s and save it in your container as multiValue -> property: {{MODELNAME}}s
		
		// critical error: 500
		// return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ErrorContainer("server-error", "Can't load data")).build();

		// if you can't find data it's not a 404 on a collection - it should be the container with an empty array!
		if(container != null){
			if(container.multiValueIsNotNull()){
				return Response.ok(container).build();
			}
		}
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add({{MODELNAME}}Container container) {
		if (container == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(new ErrorContainer("parameter-missing", "{{MODELNAME}} not defined")).build();
		}
		
		// failed: send internal server error
		// return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ErrorContainer("server-error", "Can't add {{MODELNAME}}")).build();
		
		// success: send 200
		return Response.ok().build();
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response delete(){
		// delete {{MODELNAME}}

		// If you can't delete the {{MODELNAME}} send a Internal Server Error
		// return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ErrorContainer("server-error", "Can't delete {{MODELNAME}}")).build();
		
		//success: send response with status 204 because it's delete
		return Response.status(Response.Status.NO_CONTENT).build();
	}
	
	/****************************************
	*
	*	{{MODELNAME}}
	*
	****************************************/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response get(@PathParam("id") Long id){
		{{MODELNAME}}Container container;

		// Load {{MODELNAME}} from your storage

		// if( there is an error while loading your {{MODELNAME}} send this: {
		// return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ErrorContainer("server-error", "Can't load data.")).build();
		// }

		if(container != null){
			// if there is a singleValue of {{MODELNAME}} and it is not null: send it!
			if(container.singleValueIsNotNull()){
				return Response.ok(container).build();
			} else{
				// send 404 because this should be an existing item.
				return Response.status(Response.Status.NOT_FOUND).entity(new ErrorContainer("not-found-error",
						"Can't find {{MODELNAME}} with id: " + id)).build();
			}
		}
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response update({{MODELNAME}}Container container, @PathParam("id") Long id){
		if (container == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(new ErrorContainer("parameter-missing", "{{MODELNAME}} not defined")).build();
		}
		// Update your {{MODELNAME}}

		// if (no {{MODELNAME}} to update) {
		// return Response.status(Response.Status.NOT_FOUND).entity(new ErrorContainer("parameter-missing", "{{MODELNAME}} with id " + id + " not found.")).build();
		// }

		// return 204 (NO_CONTENT) if everything was right.
		return Response.status(Response.Status.NO_CONTENT).build();
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response delete(@PathParam("id") Long id){

		// Delete from storage

		// if (error while deleting data) {
		// return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ErrorContainer("server-error", "Can't delete {{MODELNAME}}")).build();
		// }

		return Response.status(Response.Status.NO_CONTENT).build();
	}
	
}
