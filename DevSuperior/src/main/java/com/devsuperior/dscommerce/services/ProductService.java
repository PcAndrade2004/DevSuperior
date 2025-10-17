package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repository.ProductsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductsRepository repository;

    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();// pegando o produto que está dentro do result
        return new ProductDTO(product);
    }


    public Page<ProductDTO> findAll(Pageable pegeable) {
        Page<Product> result = repository.findAll(pegeable);
        return result.map(ProductDTO::new);
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto) {

        Optional<Product> existingProduct = repository.findByName(dto.getName());
        if (existingProduct.isPresent()) {
            throw new IllegalArgumentException("Já existe um produto com este nome: " + dto.getName());
        }
        Product entity = new Product();
        copyDtoToEntity(dto,entity);
        entity = repository.save(entity);
        return new ProductDTO(entity);

    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) {
        Product entity = repository.getReferenceById(id);
        //getReferenceById(id) => ele não vai no banco. Ele prepara o objeto que será monitorado pela JPA.
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ProductDTO(entity);

    }

    @Transactional
    private void copyDtoToEntity(ProductDTO dto, Product entity) {
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());
    }
}
