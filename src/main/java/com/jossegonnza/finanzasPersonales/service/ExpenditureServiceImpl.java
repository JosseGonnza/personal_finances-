package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Expenditure;
import com.jossegonnza.finanzasPersonales.repository.ExpenditureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenditureServiceImpl implements ExpenditureService{

    @Autowired
    private ExpenditureRepository expenditureRepository;

    @Override
    public List<Expenditure> findAllExpenditures() {
        return expenditureRepository.findAll();
    }

    @Override
    public List<Expenditure> findAllExpendituresByCategory(Long categoryId) {
        return expenditureRepository.findByCategoryId(categoryId);
    }

    @Override
    public Optional<Expenditure> findExpenditureById(Long id) {
        return expenditureRepository.findById(id);
    }

    @Override
    public Expenditure createExpenditure(Expenditure expenditure) {
        return expenditureRepository.save(expenditure);
    }
}
