package com.dio.productcatalog.service;

import com.dio.productcatalog.models.Product;
import com.dio.productcatalog.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @ResponseStatus(HttpStatus.CREATED)
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ResponseEntity<Product> findById(Integer id) {
        Optional<Product> optional = productRepository.findById(id);
        return optional.map(product -> ResponseEntity.ok().body(product))
        .orElseGet(() -> ResponseEntity.notFound().build());
    }
   
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
