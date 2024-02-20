package com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.models.Product;
import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.repository.ProductRepositoryInterface;

@Service
public class ProductService implements ProductServiceInterface {
    
    private ProductRepositoryInterface productRepository;

    public ProductService(@Qualifier("productRepository") ProductRepositoryInterface productRepository) 
    {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll()
    {
        return productRepository.findAll().stream().map(p -> {
            //Product product = (Product) p.clone();
            //product.setPrice(p.getPrice() * 2);
            p.setPrice(p.getPrice() * 2);

            return p;
            //return product;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id)
    {
        return productRepository.findById(id);
    }
}
