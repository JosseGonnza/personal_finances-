package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Category;
import com.jossegonnza.finanzasPersonales.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Category category1 = findCategoryById(id).orElseThrow(() -> new InvalidParameterException("Invalid Id"));
        category1.setId(category.getId());
        return categoryRepository.save(category1);
    }

    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }

}
