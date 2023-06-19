package org.example;

public class List {
    Node head;

    public void pushFront(Integer value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void deleteFront() {
        if (head != null)
            head = head.next;
    }

    public void pushBack(Integer value) {
        Node node = new Node();
        node.value = value;
        if (head == null)
            head = node;
        else {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = node;
        }
    }

    public void deleteBack() {
        if (head != null) {
            if (head.next == null)
                head = null;
            else {
                Node cur = head;
                while (cur.next.next != null) {
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
    }

    public boolean contains(Integer value) {
        Node node = head;
        while (node != null) {
            if (node.value.equals(value))
                return true;
            node = node.next;
        }
        return false;
    }


    public void print() {
        Node node = head;
        while (node != null) {
            System.out.printf(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void revers() {
        Node node = head;
        if (node != null && node.next != null) {
            Node last = null;
            while (head.next != last) {
                head = node.next;
                Node next = head.next;
                while (node.next.next != last) {
                    node.next = node.next.next;
                }
                node.next.next = node;
                head.next = next;
                last = node;

            }
        }
    }

    private class Node {
        Integer value;
        Node next;
    }

    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i < 6; i++) {
            list.pushFront(i);
        }
        list.print();
//        list.deleteFront();
//        list.deleteFront();
//        list.print();
//        System.out.println(list.contains(2));
//        System.out.println(list.contains(5));
//        list.deleteBack();
//        list.print();
//        list.pushBack(7);
//        list.print();
        list.revers();
        list.print();
    }
}