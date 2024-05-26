package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Income extends Movements{

    public Income(Long id, String name, double quantity, LocalDate date, Category category) {
        super(id, name, quantity, date);
        this.category = category;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
