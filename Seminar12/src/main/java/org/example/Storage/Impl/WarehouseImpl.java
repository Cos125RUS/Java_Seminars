package org.example.Storage.Impl;

import org.example.Storage.Product;

public interface WarehouseImpl {
    void addProduct(Product product);
    void delProduct(Product product);
    void decreaseProduct (Product product);
    void increaseProduct (Product product);
}
