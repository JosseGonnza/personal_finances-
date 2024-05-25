package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.Entity;

@Entity
public class Expenditure extends Movements{

    public Expenditure(Long id, String name, double quantity) {
        super(id, name, quantity);
    }
}
