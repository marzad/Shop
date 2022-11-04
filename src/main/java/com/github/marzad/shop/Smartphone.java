package com.github.marzad.shop;

import java.util.Optional;

public class Smartphone extends Product implements ProductInterface{
    String brand;
    String model;
    double size;
    int id;
    double price;
    String name;

    public Smartphone(String brand, String model, double size, int id, double price) {
        this.brand = brand;
        this.model = model;
        this.name=brand+" "+model;
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
/*        if(name != null)
        return name;
        else return "Kein Name vorhanden";*/

        Optional<String> os = Optional.of(this.name);
        String result;
        result = os.orElse("Kein Name vorhanden");
        return result;
    }

    @Override
    public void setName(String name) {
        //substring und
        if(name.contains(" ")) {
            String[] s = name.split(" ");
            brand = s[0];
            model = s[1];
            this.name = name;
        }
        else {System.out.println("Fehlerhafter Name!");}
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public double getPrice() {
        Optional<Double> od = Optional.of(this.price);
        if(od.isPresent()){
            return price;
        }
        return 0;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }
}
