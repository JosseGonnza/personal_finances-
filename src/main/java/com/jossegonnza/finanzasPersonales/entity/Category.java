package com.jossegonnza.finanzasPersonales.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Movements> movementsList;

    public Category(Long id, String name, List<Movements> movementsList) {
        this.id = id;
        this.name = name;
        this.movementsList = movementsList;
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

    public List<Movements> getMovementsList() {
        return movementsList;
    }

    public void setMovementsList(List<Movements> movementsList) {
        this.movementsList = movementsList;
    }
}
