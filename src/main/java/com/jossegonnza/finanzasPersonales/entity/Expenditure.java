package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;


@Entity
@DiscriminatorValue("GASTO")
public class Expenditure extends Movements{

    public Expenditure(Long id, String name, double quantity, Category category) {
        super(id, name, quantity);
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
