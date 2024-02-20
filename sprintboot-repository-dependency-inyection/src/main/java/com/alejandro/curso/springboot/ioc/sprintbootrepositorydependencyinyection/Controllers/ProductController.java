package com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.models.Product;
import com.alejandro.curso.springboot.ioc.sprintbootrepositorydependencyinyection.services.ProductServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServiceInterface productService;
    
    @GetMapping("/list")
    public List<Product> list()
    {
        return productService.findAll();   
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) 
    {
        return productService.findById(id);
    }
    
}
