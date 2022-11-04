package com.github.marzad.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepo {
    private List<Order> orders = new ArrayList();

    public void addEle(Order name) {
        orders.add(name);
    }

    public List<Order> getList() {
        Optional<List> ol = Optional.of(this.orders);
        if(ol.isPresent()){
            return this.orders;
        }
        return null;
    }

    public Order get(int i) {
        return orders.get(i);
    }

    public Order getOrderById(int i){
/*        try {
            for (Order s : this.orders) {
                if (s.getOrderID() == i) {
                    return s;
                }
            }
            return null;
        }catch (Exception e){
            System.out.println("Produkt gibt es nicht");
            return null;
        }*/

        Optional<Order> oo = Optional.empty();
        for (Order s : this.orders) {
            if (s.getOrderID() == i) {
                oo = Optional.of(s);
            }
        }
        if(oo.isEmpty()){
            System.out.println("Produkt gibt's nicht.");
            return null;
        }
        else return oo.get();
    }
}
