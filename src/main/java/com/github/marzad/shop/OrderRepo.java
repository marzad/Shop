package com.github.marzad.shop;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private List<Order> orders = new ArrayList();

    public void addEle(Order name) {
        orders.add(name);
    }

    public List<Order> list() {
        return orders;
    }

    public Order get(int i) {
        return orders.get(i);
    }

    public Order getOrderById(int i) {
        try {
            for (Order s : this.orders) {
                if (s.getOrderID() == i) {
                    return s;
                }
            }
            return null;
        }catch (Exception e){
            System.out.println("Produkt gibt es nicht");
            return null;
        }
    }
}
