package com.github.marzad.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void addEleTest() {
        Product name = new Product(1, "Apfel");
        ProductRepo liste = new ProductRepo();

        liste.addEle(name);

        assertTrue(!liste.list().isEmpty());
    }
}