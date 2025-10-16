package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    private ProductsRepository repository;

    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();// pegando o produto que está dentro do result
        return new ProductDTO(product);
    }
}
