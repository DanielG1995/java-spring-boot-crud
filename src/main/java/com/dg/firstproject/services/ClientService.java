package com.dg.firstproject.services;

import com.dg.firstproject.models.ClientModel;

import com.dg.firstproject.repository.ClientRepository;
import com.dg.firstproject.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ResponseEntity<Optional<ClientModel>> getClient(Long id) {
        Optional<ClientModel> respClient = clientRepository.findById(id);
        return ResponseEntity.ok(respClient);

    }

    public ResponseEntity<List<ClientModel>> getClients() {

        return ResponseEntity.ok(clientRepository.findAll());

    }

    public ResponseEntity<Object> saveClient(ClientModel client) {

        ClientModel respClient = clientRepository.save(client);
        return ResponseEntity.ok(respClient);

    }

}
