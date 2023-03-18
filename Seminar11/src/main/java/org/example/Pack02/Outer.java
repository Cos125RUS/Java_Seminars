package org.example.Pack02;

public class Outer {
    public static void main(String[] args) {
        class Point{
            int x;
            int y;
            int z;

            public Point(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }

            public String toString(String value){
                return value;
            }
        }

        Point p = new Point(1,2,3);
    }
}
