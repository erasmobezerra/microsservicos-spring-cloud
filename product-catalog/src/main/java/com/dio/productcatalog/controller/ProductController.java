package com.dio.productcatalog.controller;

import com.dio.productcatalog.models.Product;
import com.dio.productcatalog.repository.ProductRepository;
import com.dio.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productService.findByName(name);
    }
}