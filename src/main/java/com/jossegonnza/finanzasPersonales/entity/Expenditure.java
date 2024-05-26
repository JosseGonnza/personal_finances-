package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("GASTO")
public class Expenditure extends Movements{

    public Expenditure(Long id, String name, double quantity, LocalDate date, Category category) {
        super(id, name, quantity, date);
        this.category = category;
    }

    public Expenditure() {
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
