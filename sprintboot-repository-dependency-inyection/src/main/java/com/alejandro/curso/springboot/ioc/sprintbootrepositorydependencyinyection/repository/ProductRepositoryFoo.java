package com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.models.Product;

@Repository
public class ProductRepositoryFoo implements ProductRepositoryInterface {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "Example", 1L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Example", 1L);
    }
    
}
