package com.desafioclienteCRUD.desafioCRUD.controller;

import com.desafioclienteCRUD.desafioCRUD.dto.ClientDTO;
import com.desafioclienteCRUD.desafioCRUD.services.ClientServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientServie servie;

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        ClientDTO dto = servie.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> getAllProducts(@PageableDefault(page = 0, size = 10)Pageable pageable) {
        Page<ClientDTO> products = servie.findAll(pageable);
        return ResponseEntity.ok(products);
    }
}
