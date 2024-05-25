package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
public class Expenditure extends Movements{

    public Expenditure(Long id, String name, double quantity, LocalDate date, Category category) {
        super(id, name, quantity, date, category);
    }
}
