package br.luiz.rent.money.challenge.control;

import br.luiz.rent.money.challenge.dto.ClientDto;
import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;
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

    @POST
    @Path("/newClient")
    public Response createNewClient(JsonObject client) {
        ClientDto clientDto = new ClientDto();
        return Response.ok().entity(clientDto).build();
    }

}
