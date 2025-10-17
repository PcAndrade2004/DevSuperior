package com.devsuperior.dscommerce.repository;

import com.devsuperior.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);

}
