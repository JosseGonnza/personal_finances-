package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Expenditure;

import java.util.List;
import java.util.Optional;

public interface ExpenditureService {

    List<Expenditure> findAllExpenditures();
    List<Expenditure> findAllExpendituresByCategory(Long categoryId);
    Optional<Expenditure> findExpenditureById(Long id);

}
