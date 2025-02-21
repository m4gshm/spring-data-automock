package test.jpa.service;

import test.jpa.model.Client;

import java.util.List;

public interface ClientService {
    Client getById(Long id);

    Client store(Client client);

    List<Client> getAll();
}
