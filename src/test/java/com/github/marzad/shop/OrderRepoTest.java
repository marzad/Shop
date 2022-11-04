package com.github.marzad.shop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addEleTest() {
        Order name = new Order(1, new Product(1,"Apple"));
        OrderRepo liste = new OrderRepo();

        liste.addEle(name);

        assertTrue(!liste.list().isEmpty());
    }

    @Test
    void addEleTest_if_Product_is_Schokoriegel() {
        Order name = new Order();
        Product riegel = new Schokoriegel("Milka", "Zartbitter", 0.99, 1, 100);
        name.setOrderID(1);
        name.setProduct(riegel);
        OrderRepo liste = new OrderRepo();

        liste.addEle(name);

        assertThat(liste.get(0).toString()).matches(".*model=\\'Zartbitter\\'.*");
    }
}