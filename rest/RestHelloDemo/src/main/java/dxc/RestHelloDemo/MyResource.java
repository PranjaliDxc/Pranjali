package dxc.RestHelloDemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("test")
public class MyResource {

	 @GET  
	    @Produces(MediaType.APPLICATION_JSON)  
	    public String sayHello() {  
	        return "Welcome to Rest Webservices...";
	    } 

	    @GET  
	    @Path("/sum/{i}/{j}")
	    @Produces(MediaType.APPLICATION_JSON)  
	    public String sum(@PathParam("i") int i,
	    @PathParam("j") int j ) {  
	        int c = i+j;
	        String res = "Sum is  " +c;
	        return res;
	    } 
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "My First Program in Reset Services...Thank You";
    }
    
    
}
