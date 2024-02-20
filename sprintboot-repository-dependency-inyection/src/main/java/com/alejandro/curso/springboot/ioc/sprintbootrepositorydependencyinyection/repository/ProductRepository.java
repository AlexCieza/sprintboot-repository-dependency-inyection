package com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.models.Product;

@Primary
@RequestScope
@Repository
public class ProductRepository implements ProductRepositoryInterface {

    private List<Product> data; 

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Example 1", 1L),
            new Product(2L, "Example 2", 2L),
            new Product(3L, "Example 3", 3L)
        );
    }

    @Override
    public List<Product> findAll()
    {
        return this.data;
    }

    @Override
    public Product findById(Long id)
    {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
