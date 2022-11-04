package com.github.marzad.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepo extends Product {
    private List<Product> products = new ArrayList();

    public void addEle(Product name) {
        products.add(name);
    }

    public List<Product> getProductList() {
        Optional<List> ol = Optional.of(products);
        if(ol.isPresent()){
            return products;
        }
        return null;
    }

    public Product get(int i) {
        return products.get(i);
    }

    public Product getProdByName(String name) {
/*        for (Product s : this.products) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;*/

        Optional<Product> op = Optional.empty();
        for (Product s : this.products) {
            if (s.getName().equals(name)) {
                op = Optional.of(s);
            }
        }
        if(op.isEmpty()){
            System.out.println("Produkt gibt's nicht.");
            return null;
        }
        else return op.get();
    }
}
