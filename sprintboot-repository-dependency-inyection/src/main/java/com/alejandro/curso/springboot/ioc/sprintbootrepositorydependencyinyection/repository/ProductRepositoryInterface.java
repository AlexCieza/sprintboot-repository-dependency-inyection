package com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.repository;

import java.util.List;

import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.models.Product;

public interface ProductRepositoryInterface {
    
    public List<Product> findAll();

    public Product findById(Long id);
}
