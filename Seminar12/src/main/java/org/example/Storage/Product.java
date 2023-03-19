package org.example.Storage;

import org.example.Storage.Impl.ProductImpl;

public class Product implements ProductImpl {
    String name;
    static int count = 0;
    double price;

    public Product(String name, int count, double price) {
        this.name = name;
        this.count += count;
        this.price = price;
    }

    public Product() {
        this.name = "name";
        this.count += 5;
        this.price = 25.45;
    }


    @Override
    public void decreaseQuantity(int amount) {
        this.count -= amount;
    }

    @Override
    public void increaseQuantity(int amount) {
        this.count += amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
