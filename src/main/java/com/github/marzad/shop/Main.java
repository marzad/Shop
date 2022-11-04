package com.github.marzad.shop;

public class Main {
    public static void main(String[] args) {
        ProductRepo prodRep = new ProductRepo();

        Product prod1 = new Product(1, "Apfel");
        Product prod2 = new Product(2, "Banane");
        prodRep.addEle(prod1);
        prodRep.addEle(prod2);

    }
}