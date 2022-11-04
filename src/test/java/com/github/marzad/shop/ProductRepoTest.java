package com.github.marzad.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class ProductRepoTest {

    @Test
    void addEleTest() {
        Product name = new Product(1, "Apfel");
        ProductRepo liste = new ProductRepo();

        liste.addEle(name);

        assertTrue(!liste.list().isEmpty());
    }

    @Test
    void addEleTest_if_Product_is_Smartphone() {
        Smartphone smartphone = new Smartphone();
        smartphone.setId(1);
        smartphone.setName("Google Pixel7Pro");
        smartphone.setPrice(899.00);
        ProductRepo liste = new ProductRepo();

        liste.addEle(smartphone);

        assertThat(liste.get(0).toString()).matches(".*name=\\'Google Pixel7Pro\\'.*");
    }


}