package com.github.marzad.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void addOrderTest() {
        Order o = new Order(1, new Product(1, "Banane"));
        ShopService list = new ShopService();
        list.addOrder(o);
        assertFalse(!list.getListOrders().isEmpty());
    }
}