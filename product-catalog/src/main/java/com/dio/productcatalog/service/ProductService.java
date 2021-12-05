package com.dio.productcatalog.service;

import com.dio.productcatalog.models.Product;
import com.dio.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    public Iterable<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
