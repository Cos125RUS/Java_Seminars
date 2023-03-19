package org.example.Storage;

import org.example.Storage.Impl.ProductImpl;

import java.util.ArrayList;
import java.util.List;

public class Order implements ProductImpl {
    Warehouse warehouse;
    List<Product> productList;

    public Order(List<Product> productList) {
        this.warehouse = new Warehouse();
        this.productList = productList;
    }

    public Order() {

    }


    @Override
    public void decreaseQuantity(int amount) {

    }

    @Override
    public void increaseQuantity(int amount) {

    }

    @Override
    public String toString() {
        return "Order{" +
                "warehouse=" + warehouse.toString() +
                ", productList=" + productList.toString() +
                '}';
    }
}
