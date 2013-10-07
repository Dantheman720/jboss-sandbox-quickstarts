package org.jboss.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.annotation.security.*;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.jboss.resteasy.util.HttpServletRequestDelegate;

@Path("/message")
public class MessageRestService {

	/**
	 * Sends a blank message on access to the RESTful application
	 * @return
	 */
	@GET
	public Response sendBlankMessage() {
		String result = "Helloworld!";
		HttpServletDispatcher dan = new HttpServletDispatcher();
		
		return Response.status(200).entity(result).build();
	}

	/**
	 * Accepts a string parameter and says hello it.
	 * @param msg
	 * @return
	 */
	@GET
	@Path("helloworld/{param}")
	public Response printHelloSpecific(@PathParam("param") String msg) {
		String result;
		if (msg == null || msg.isEmpty())
			result = "Name can not be empty";
		else {
			result = "Restful example : " + msg;
		}
		return Response.status(200).entity(result).build();

	}
	/**
	 * Only Administrators can access this method.  Produces a JSON object to be interpreted.
	 * @return
	 */
	@GET
	@Path("helloworld/adminHello")
	@Produces("application/json")
	@RolesAllowed("Admin")
	public Response getSecureMessage() {
		String result = "Hello World to Admin";

		return Response.status(200).entity(result).build();
	}
	

}