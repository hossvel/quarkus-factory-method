package com.hossvel.resource;

import com.hossvel.service.IGreetingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    IGreetingService factory;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String greet(@QueryParam("name") String name) {
        return factory.greet(name);
    }
}
