package com.dio.productcatalog.repository;

import com.dio.productcatalog.models.Product;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
    List<Product> findByName(String name);
}
