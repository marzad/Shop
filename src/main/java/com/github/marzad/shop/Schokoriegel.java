package com.github.marzad.shop;

public class Schokoriegel implements ProductInterface{
    String brand;
    String model;
    double price;
    int id;
    String name;
    double weight;

    public Schokoriegel(String brand, String model, double price, int id, double weight) {
        this.brand = brand;
        this.model = model;
        this.name = brand+" "+model;
        this.price = price;
        this.id = id;
        this.weight= weight;
    }
    public Schokoriegel(){}

    @Override
    public String toString() {
        return "Schokoriegel{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

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
        if(name != null)
            return name;
        else return "Kein Name vorhanden";
    }

    @Override
    public void setName(String name) {
        if(name.contains(" ")) {
            String[] s = name.split(" ");
            brand = s[0];
            model = s[1];
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
        this.price = price;
    }
}
