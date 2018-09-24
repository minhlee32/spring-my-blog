package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Post;

public interface CategoryService {

    Iterable<Category> findAll();

    Post findById(Long id);

    void save(Category category);

    void remove(Long id);
}
