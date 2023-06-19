package org.example;

public class Tree {
    Node root;

    public boolean contains(int value) { // O(log N)
        Node cur = root;
        while (cur != null) {
            if (cur.value == value)
                return true;
            else {
                if (cur.value < value)
                    cur = cur.right;
                else
                    cur = cur.left;
            }
        }
        return false;
    }

    public void print() {
        print(root);
    }

    private void print(Node node) {
        if (node == null)
            return;
        System.out.println(node.value);

        if (node.left != null)
            System.out.println("L:" + node.left.value);

        if (node.right != null)
            System.out.println(" R:" + node.right.value + "\t");

        print(node.left);
        print(node.right);
    }

    class Node {
        int value;
        Node left;
        Node right;
        Node parent;
    }


    public static void main(String[] args) {

    }
}