package com.github.marzad.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addEleTest() {
        Order name = new Order(1, new Product(1,"Apple"));
        OrderRepo liste = new OrderRepo();

        liste.addEle(name);

        assertTrue(!liste.list().isEmpty());
    }
}