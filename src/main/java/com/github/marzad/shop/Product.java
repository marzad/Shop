package com.github.marzad.shop;

import java.util.Optional;

public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Product(){}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        Optional<Integer> oi = Optional.of(this.id);
        return oi.get();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        Optional<String> os = Optional.of(this.name);
        return os.get();
    }

    public void setName(String name) {
        this.name = name;
    }
}
