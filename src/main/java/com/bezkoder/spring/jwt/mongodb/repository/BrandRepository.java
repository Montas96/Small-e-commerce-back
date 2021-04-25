package com.bezkoder.spring.jwt.mongodb.repository;

import com.bezkoder.spring.jwt.mongodb.models.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BrandRepository extends MongoRepository<Brand, String> {
}
