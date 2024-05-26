package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Category;
import com.jossegonnza.finanzasPersonales.entity.Income;

import java.util.List;
import java.util.Optional;

public interface IncomeService {

    List<Income> findAllIncomes();
    List<Category> findAllIncomesByCategory(Long categoryId);
    Optional<Income> findIncomeById(Long id);

}
