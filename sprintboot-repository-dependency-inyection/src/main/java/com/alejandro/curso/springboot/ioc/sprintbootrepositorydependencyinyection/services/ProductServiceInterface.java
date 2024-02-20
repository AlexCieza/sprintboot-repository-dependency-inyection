package com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.services;

import java.util.List;

import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.models.Product;

public interface ProductServiceInterface {
    
    public List<Product> findAll();


    public Product findById(Long id);
}
