package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Income> incomeList;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Expenditure> expenditureList;

    public Category(Long id, String name, List<Income> incomeList, List<Expenditure> expenditureList) {
        this.id = id;
        this.name = name;
        this.incomeList = incomeList;
        this.expenditureList = expenditureList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Income> getIncomeList() {
        return incomeList;
    }

    public void setIncomeList(List<Income> incomeList) {
        this.incomeList = incomeList;
    }

    public List<Expenditure> getExpenditureList() {
        return expenditureList;
    }

    public void setExpenditureList(List<Expenditure> expenditureList) {
        this.expenditureList = expenditureList;
    }
}
