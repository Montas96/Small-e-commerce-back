package com.bezkoder.spring.jwt.mongodb.service;

import com.bezkoder.spring.jwt.mongodb.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    Page<Product> getAllProducts(Pageable pageable);
    Page<Product> getAllProductsByCategoryId(String categoryId, Pageable pageable);
    Page<Product> getAllProductsByBrandId(String brandId, Pageable pageable);
    Product getProductById(String productId);
    Product save(Product product);
    void delete(String id);


}
