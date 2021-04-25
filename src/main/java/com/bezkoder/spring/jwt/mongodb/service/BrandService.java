package com.bezkoder.spring.jwt.mongodb.service;

import com.bezkoder.spring.jwt.mongodb.models.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {

    List<Brand> getAllBrands();

    Brand findById(String ID);

    Brand save(Brand brand);

    void deleteById(String id);
}
