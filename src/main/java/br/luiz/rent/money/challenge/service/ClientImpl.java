package br.luiz.rent.money.challenge.service;

import br.luiz.rent.money.challenge.dto.ClientDto;
import br.luiz.rent.money.challenge.entity.Client;

public class ClientImpl {

    public Client createNewClient(ClientDto clientDto) {
        Client newClient = new Client();
        newClient.setName("");
        newClient.setPassword("");
        newClient.setEmail("");
        newClient.setCpf(0);
        newClient.setRg(0);
        newClient.setAddress("");
        newClient.setIncomeCash(0.0);
        return newClient;
    }
}
