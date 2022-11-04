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

    public Order getOrderByName(String name) {
        for (Order s : this.orders) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}
