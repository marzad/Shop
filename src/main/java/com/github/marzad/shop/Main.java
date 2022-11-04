package com.github.marzad.shop;

public class Main {
    public static void main(String[] args) {
        ProductRepo prodRep = new ProductRepo();
        OrderRepo ordRep = new OrderRepo();
        Product prod1 = new Product(1, "Apfel");
        Product prod2 = new Product(2, "Banane");
        Product prod3 = new Product(3, "Birne");
        prodRep.addEle(prod1);
        prodRep.addEle(prod2);
        prodRep.addEle(prod3);
        /*System.out.println(prodRep.list());

        System.out.println(prodRep.getProdByName("Apfel"));
        System.out.println("GetMethode by index 2: "+ prodRep.get(2));*/

        Order ord1 = new Order(1, prod1);
        Order ord2 = new Order(2, prod2);
        Order ord3 = new Order(3, prod3);
        ordRep.addEle(ord1);
        ordRep.addEle(ord2);
        ordRep.addEle(ord3);
        System.out.println("Liste der Bestellungen: "+ordRep.list());

    }
}