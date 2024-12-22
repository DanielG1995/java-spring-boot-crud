package com.dg.firstproject.controller;

import com.dg.firstproject.models.ClientModel;
import com.dg.firstproject.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping( "/{id}")
    public ResponseEntity<Optional<ClientModel>> getClient(
            @PathVariable(name = "id") Long id) {
        return clientService.getClient(id);
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> getClients() {
        return clientService.getClients();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveClient(
            @RequestBody ClientModel clientModel) {
        return clientService.saveClient(clientModel);
    }
}
