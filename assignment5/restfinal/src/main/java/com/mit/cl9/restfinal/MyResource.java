package com.mit.cl9.restfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
	 HashMap<String,ArrayList<String>> userdata = new HashMap<String,ArrayList<String>>();
	@GET
    @Path("/{name}/getprojects")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@PathParam("name") String name) {
    
       
        userdata.put("asdf",new ArrayList<>(Arrays.asList("xyz", "abc")));
        userdata.put("mayur",new ArrayList<>(Arrays.asList("xyz", "abc")));
        ArrayList<String> data = userdata.get(name);
        return data.toString();
    }
	@GET
    @Path("/getNames")
    @Produces(MediaType.TEXT_PLAIN)
    public String getNames() {
    
       
		 userdata.put("asdf",new ArrayList<>(Arrays.asList("xyz", "abc")));
		 userdata.put("mayur",new ArrayList<>(Arrays.asList("xyz", "abc")));
        return userdata.keySet().toString();
    }
}
