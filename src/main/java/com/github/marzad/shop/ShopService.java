package com.github.marzad.shop;

import java.util.List;
import java.util.Optional;

public class ShopService {
    ProductRepo prodRepo = new ProductRepo();
    OrderRepo ordRepo = new OrderRepo();

    public Product getProduct(String name) {
        return prodRepo.getProdByName(name);
    }

    public List<Product> listProducts() {
        return prodRepo.getProductList();
    }

    public Order getOrder(int i){
        return ordRepo.getOrderById(i);
    }

    public List<Order> getListOrders() {
        Optional<List> ol = Optional.of(ordRepo.getList());
        if(ol.isPresent()) {
            return ordRepo.getList();
        }
        return null;
    }

    public void addOrder(Order o) {
        try {
            //ordRepo.addEle(o);
            if(prodRepo.getProdByName(o.getProduct().getName())!=null){
                ordRepo.addEle(o);
            }
            else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Bestellung nicht möglich");
        }
    }
    public void addProd(Product name) {
        prodRepo.addEle(name);
    }
}
