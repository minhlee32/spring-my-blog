package com.codegym.repository;

import com.codegym.service.CategoryService;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<CategoryService, Long> {

}
