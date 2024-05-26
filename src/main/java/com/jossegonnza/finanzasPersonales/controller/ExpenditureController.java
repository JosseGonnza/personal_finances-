package com.jossegonnza.finanzasPersonales.controller;

import com.jossegonnza.finanzasPersonales.entity.Expenditure;
import com.jossegonnza.finanzasPersonales.service.ExpenditureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/expenditures")
public class ExpenditureController {

    @Autowired
    private ExpenditureServiceImpl expenditureService;

    @GetMapping
    public List<Expenditure> getAllExpenditure() {
        return expenditureService.findAllExpenditures();
    }

    @GetMapping("/category{id}")
    public List<Expenditure> getAllExpenditureByCategory(@PathVariable Long categoryId) {
        return expenditureService.findAllExpendituresByCategory(categoryId);
    }

    @GetMapping("/{id}")
    public Optional<Expenditure> getExpenditureById(@PathVariable Long id) {
        return expenditureService.findExpenditureById(id);
    }

    @PostMapping("/")
    public Expenditure createNewExpenditure(@RequestBody Expenditure expenditure) {
        return expenditureService.createExpenditure(expenditure);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExpenditure(@PathVariable Long id) {
        expenditureService.deleteExpenditure(id);
    }

}
