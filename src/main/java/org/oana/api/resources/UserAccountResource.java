package org.oana.api.resources;

import org.oana.api.dto.UserDTO;
import org.oana.api.services.UserAccountService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserAccountResource {

    @Inject
    UserAccountService userAccountService;

    @PUT
    public Response createUser(UserDTO userDTO) {
        return userAccountService.createUser(userDTO);
    }

    @GET
    public Response getUsers() {
        return userAccountService.getUsers();
    }   
}