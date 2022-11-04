package com.github.marzad.shop;

public class Order extends Product{
    private int orderID;
    private Product product;

    public Order(int id, String name, int orderID, Product product) {
        super(id, name);
        this.orderID = orderID;
        this.product = product;
    }

    public Order(int orderID, Product product) {
        this.orderID = orderID;
        this.product = product;
    }
    public Order(){}

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", product=" + product +
                '}';
    }
}
