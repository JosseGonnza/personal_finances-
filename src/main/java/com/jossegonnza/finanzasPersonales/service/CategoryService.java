package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> findAllCategories();
    Optional<Category> findCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategoryById(Long id);

}
