package org.example;

import java.util.List;

public class HashMap {
    final int INIT_SIZE = 16;
    Basket[] baskets;

    public HashMap() {
        this.baskets = new Basket[INIT_SIZE];
    }

    public HashMap(int size) {
        this.baskets = new Basket[size];
    }

    public class Entity {
        int key;
        int value;
    }

    public class Basket {
        Node head;

        public Integer find(int key) {
            Node node = head;
            while (node != null)
                if (node.entity.key == key)
                    return node.entity.value;
            return null;
        }

        public boolean push(int key, int value) {
            Node node = new Node();
            node.entity = new Entity();
            node.entity.key = key;
            node.entity.value = value;
            if (head == null) {
                head = node;
                return true;
            } else {
                Node cur = head;
                while (cur.next != null)
                    if (cur.entity.key == key)
                        return false;
                cur.next = node;
            }
            return true;
        }

        class Node {
            Entity entity;
            Node next;
        }
    }

    public int getIndex(int key) {
        return key % baskets.length;
    }

    public Integer find(int key) {
        int index = getIndex(key);
        Basket basket = this.baskets[index];
        if (basket == null)
            return null;
        return basket.find(key);
    }

    public boolean push(int key, int value) {
        int index = getIndex(key);
        Basket basket = this.baskets[index];
        if (basket == null) {
            Basket b = new Basket();
            boolean res = b.push(key, value);
            baskets[index] = b;
            return res;
        } else {
            return basket.push(key, value);
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.push(i, i);
        }
        System.out.println(map.find(3));
        System.out.println(map.find(6));
    }
}
