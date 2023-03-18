package org.example.Pack01;

public class Outer {
    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(innerValue);
            System.out.println(outerValue);
            outerMethod();
        }
    }

    int outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        innerMethod();

    }

    public static void main(String[] args) {

    }
}
