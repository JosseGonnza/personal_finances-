package com.jossegonnza.finanzasPersonales.controller;

import com.jossegonnza.finanzasPersonales.entity.Income;
import com.jossegonnza.finanzasPersonales.service.IncomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/incomes")
public class IncomeController {

    @Autowired
    private IncomeServiceImpl incomeService;

    @GetMapping("/")
    public List<Income> getAllIncomes() {
        return incomeService.findAllIncomes();
    }

    @GetMapping("/category{id}")
    public List<Income> getAllIncomesByCategory(@PathVariable Long categoryId) {
        return incomeService.findAllIncomesByCategory(categoryId);
    }

    @GetMapping("/{id}")
    public Optional<Income> getIncomeById(@PathVariable Long id) {
        return incomeService.findIncomeById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Income> createIncome(@RequestBody Income income) {
        Income createdIncome = incomeService.createIncome(income);
        return new ResponseEntity<>(createdIncome, HttpStatus.CREATED);
    }

}
