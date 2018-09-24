package com.codegym.service;

import com.codegym.model.Post;

import java.util.List;

public interface PostService {

    Iterable<Post> findAll();

    Post findById(Long id);

    void save(Post post);

    void remove(Long id);
}
