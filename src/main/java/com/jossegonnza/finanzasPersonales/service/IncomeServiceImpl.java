package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Income;
import com.jossegonnza.finanzasPersonales.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeServiceImpl implements IncomeService{

    @Autowired
    private IncomeRepository incomeRepository;

    @Override
    public List<Income> findAllIncomes() {
        return incomeRepository.findAll();
    }

    @Override
    public List<Income> findAllIncomesByCategory(Long categoryId) {
        return incomeRepository.findByCategoryId(categoryId);
    }

    @Override
    public Optional<Income> findIncomeById(Long id) {
        return incomeRepository.findById(id);
    }
}
