package br.luiz.rent.money.challenge.service;

import br.luiz.rent.money.challenge.dto.ClientDto;
import br.luiz.rent.money.challenge.entity.Client;
import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClientService {

    public Client createNewClient(JsonObject client) {
        Client newClient = new Client();
        newClient.setName(client.getString("name"));
        newClient.setPassword(client.getString("password"));
        newClient.setEmail(client.getString("email"));
        newClient.setCpf(client.getInteger("cpf"));
        newClient.setRg(client.getInteger("rg"));
        newClient.setAddress(client.getString("address"));
        newClient.setIncomeCash(client.getDouble("incomeCash"));
        try {
            //TODO: Implement to insert BD here
            return newClient;
        } catch (Exception e) {
            return null;
        }
    }
}
