package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Income;

import java.util.List;
import java.util.Optional;

public interface IncomeService {

    List<Income> findAllIncomes();
    List<Income> findAllIncomesByCategory(Long categoryId);
    Optional<Income> findIncomeById(Long id);
    Income createIncome(Income income);

}
