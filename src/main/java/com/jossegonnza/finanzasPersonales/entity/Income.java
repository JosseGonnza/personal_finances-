package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;


@Entity
@DiscriminatorValue("INGRESO")
public class Income extends Movements{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    public Income(Long id, String name, double quantity, Category category) {
        super(id, name, quantity);
        this.category = category;
    }

    public Income() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
