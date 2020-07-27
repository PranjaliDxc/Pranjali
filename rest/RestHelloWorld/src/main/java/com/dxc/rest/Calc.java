package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calcservice")
public class Calc {

	@GET
	@Path("/sum/{x}/{y}")
	@Produces(MediaType.APPLICATION_JSON)
	public int sum(@PathParam("x") int x, @PathParam("y") int y) {
		return x+y;
	}
	
	@GET
	@Path("/sub/{x}/{y}")
	@Produces(MediaType.APPLICATION_JSON)
	public int sub(@PathParam("x") int x, @PathParam("y") int y) {
		return x-y;
	}
	
	@GET
	@Path("/mult/{x}/{y}")
	@Produces(MediaType.APPLICATION_JSON)
	public int mult(@PathParam("x") int x, @PathParam("y") int y) {
		return x*y;
	}
}
