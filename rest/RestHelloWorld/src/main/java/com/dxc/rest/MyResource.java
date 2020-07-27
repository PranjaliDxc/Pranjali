package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Welcome to Rest WebServices...from DXC...Thank You";
    }
    
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String goodMorining() {
    	return "Good Morning...Class starts by 9.30 Everyday...";
    }
    
    @GET
    @Path("/greet/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String greet(@PathParam("name") String name) {
    	return "Hi " +name+ " Welcome to Java Training...";
    }
}
