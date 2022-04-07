package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
