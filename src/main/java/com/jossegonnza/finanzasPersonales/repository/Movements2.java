package com.jossegonnza.finanzasPersonales.repository;

import com.jossegonnza.finanzasPersonales.entity.MovementsType;

public class Movements2 {

    private int id;
    private MovementsType type;
    private String name;
    private double quantity;
    private int category_id;

    public Movements2(int id, MovementsType type, String name, double quantity, int category_id) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.category_id = category_id;
    }

    public MovementsType getType() {
        return type;
    }


    public String getName() {
        return name;
    }


    public double getQuantity() {
        return quantity;
    }


    public int getCategory_id() {
        return category_id;
    }

    public int getId() {
        return id;
    }
}
