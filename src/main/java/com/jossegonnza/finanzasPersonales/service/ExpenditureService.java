package com.jossegonnza.finanzasPersonales.service;

import com.jossegonnza.finanzasPersonales.entity.Expenditure;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ExpenditureService {

    List<Expenditure> findAllExpenditures();
    List<Expenditure> findAllExpendituresByCategory(Long categoryId);
    Optional<Expenditure> findExpenditureById(Long id);
    Expenditure createExpenditure(Expenditure expenditure);
    void deleteExpenditure(Long id);

}
