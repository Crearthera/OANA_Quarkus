package org.oana.api.services;

import org.oana.api.dto.UserDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.core.Response;
import org.jooq.DSLContext;
import java.util.UUID;

@ApplicationScoped
public class UserAccountService {

    @Inject
    DSLContext dsl;

    @Transactional
    public Response createUser(@Valid UserDTO userDTO) {
        if (userExists(userDTO.id)) {
            return Response.status(Response.Status.CONFLICT).entity("L'utilisateur existe déjà.").build();
        }
        
        dsl.insertInto(org.oana.storage.tables.UserAcounts.USER_ACOUNTS)
           .set(org.oana.storage.tables.UserAcounts.USER_ACOUNTS.PROVIDER_ID, userDTO.id)
           .execute();
        
        return Response.status(Response.Status.CREATED).build();
    }

    private boolean userExists(UUID id) {
        return dsl.fetchExists(dsl.selectFrom(org.oana.storage.tables.UserAcounts.USER_ACOUNTS)
                                 .where(org.oana.storage.tables.UserAcounts.USER_ACOUNTS.ID.eq(id)));
    }

    public Response getUsers() {
        return Response.ok(dsl.selectFrom(org.oana.storage.tables.UserAcounts.USER_ACOUNTS)
                              .fetch()
                              .into(UserDTO.class)).build();
    }
}