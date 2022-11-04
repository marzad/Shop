package com.github.marzad.shop;

public class Smartphone implements ProductInterface{
    String brand;
    String model;
    double size;
    int id;
    double price;
    String name;

    public Smartphone(String brand, String model, double size, int id, double price) {
        this.brand = brand;
        this.model = model;
        this.name=brand+model;
        this.size = size;
        this.id = id;
        this.price = price;
    }
    public Smartphone(){}


    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name.equals(brand+" "+model)) {
            this.name = name;
        }
        else {System.out.println("Fehlerhafter Name!");}
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }
}
