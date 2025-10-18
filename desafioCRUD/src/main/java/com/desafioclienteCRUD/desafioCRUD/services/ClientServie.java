package com.desafioclienteCRUD.desafioCRUD.services;

import com.desafioclienteCRUD.desafioCRUD.dto.ClientDTO;
import com.desafioclienteCRUD.desafioCRUD.entity.Client;
import com.desafioclienteCRUD.desafioCRUD.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServie {

    @Autowired
    private ClientRepository repository;

    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(ClientDTO::new);
    }


}
