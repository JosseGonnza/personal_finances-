package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;


@Entity
@DiscriminatorValue("GASTO")
public class Expenditure extends Movements{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    public Expenditure(Long id, String name, double quantity, Category category) {
        super(id, name, quantity);
        this.category = category;
    }

    public Expenditure() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
