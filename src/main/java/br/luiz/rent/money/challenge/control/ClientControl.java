package br.luiz.rent.money.challenge.control;

import br.luiz.rent.money.challenge.dto.ClientDto;
import br.luiz.rent.money.challenge.entity.Client;
import br.luiz.rent.money.challenge.service.ClientService;
import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/client")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClientControl {

    @Inject
    ClientService clientService;

    @POST
    @Path("/newClient")
    public Response createNewClient(JsonObject client) {
        Client newClient = clientService.createNewClient(client);
        return (newClient != null)
                ? Response.ok().entity(newClient).build()
                : Response.status(Response.Status.BAD_REQUEST.getStatusCode()).entity("Fail to insert new client!").build();
    }

}
