package com.bezkoder.spring.jwt.mongodb.service;

import com.bezkoder.spring.jwt.mongodb.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAllCategories();

    Category findById(String ID);

    Category save(Category category);

    void deleteById(String id);
}
