package com.github.marzad.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo extends Product {
    private List<Product> products = new ArrayList();

    public void addEle(Product name) {
        products.add(name);
    }

    public List<Product> list() {
        return products;
    }

    public Product get(int i) {
        return products.get(i);
    }

    public Product getProdByName(String name) {
        for (Product s : this.products) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}
