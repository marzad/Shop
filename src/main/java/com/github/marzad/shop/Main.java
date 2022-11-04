package com.github.marzad.shop;

public class Main {
    public static void main(String[] args) {
        ProductRepo prodRep = new ProductRepo();
        OrderRepo ordRep = new OrderRepo();
        ShopService shpServ = new ShopService();


        Product prod1 = new Product(1, "Apfel");
        Product prod2 = new Product(2, "Banane");
        Product prod3 = new Product(3, "Birne");
        Product prod4 = new Product(4, "Melone");

        shpServ.addProd(prod1);
        shpServ.addProd(prod2);
        shpServ.addProd(prod3);

        //ordRep.addEle(new Order(1,prod1));

        shpServ.addOrder(new Order(1,prod1));
        shpServ.addOrder(new Order(1,prod4));

        /*
        prodRep.addEle(prod1);
        prodRep.addEle(prod2);
        prodRep.addEle(prod3);

        System.out.println(prodRep.list());

        System.out.println(prodRep.getProdByName("Apfel"));
        System.out.println("GetMethode by index 2: "+ prodRep.get(2));

        Order ord1 = new Order(1, prod1);
        Order ord2 = new Order(2, prod2);
        Order ord3 = new Order(3, prod3);
        ordRep.addEle(ord1);
        ordRep.addEle(ord2);
        ordRep.addEle(ord3);
        System.out.println("Liste der Bestellungen: "+ordRep.list());
        System.out.println("Order by Id: " +ordRep.getOrderById(1));
        System.out.println("Order by Id: " +ordRep.getOrderById(2));
*/
    }
}