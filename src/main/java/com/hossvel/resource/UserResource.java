package com.hossvel.resource;

import com.hossvel.model.User;
import com.hossvel.service.IUserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Set;

@Path("/user")
@Produces( MediaType.APPLICATION_JSON)
@Consumes( MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    IUserService iUserService;

    @GET
    public Set<User> getlistAll() {
        return iUserService.listAllUsers();
    }
}