package org.example.Storage;

import org.example.Storage.Impl.WarehouseImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Warehouse implements WarehouseImpl {
    List<Product> productList;

    public Warehouse() {
        this.productList = new ArrayList<>();
        productList.add(new Product());
        productList.add(new Product());
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void delProduct(Product product) {

    }

    @Override
    public void decreaseProduct(Product product) {

    }

    @Override
    public void increaseProduct(Product product) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product p:productList)
            sb.append(p.toString()).append("\n");
        return sb.toString();
    }
}
