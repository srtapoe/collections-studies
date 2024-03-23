package br.studies.beginner.challenge3;

import lombok.Getter;

public class Product {
    private String name;
    @Getter
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
