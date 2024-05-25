package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.Entity;

@Entity
public class Income extends Movements{

    public Income(Long id, String name, double quantity) {
        super(id, name, quantity);
    }



}
