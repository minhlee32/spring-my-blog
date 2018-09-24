package com.codegym.service;

import com.codegym.model.Post;

public interface Category {

    Iterable<Post> findAll();

    Post findById(Long id);

    void save(Category category);

    void remove(Long id);
}
