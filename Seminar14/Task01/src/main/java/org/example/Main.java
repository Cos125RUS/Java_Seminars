package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("sum = " + sumOfNums(12));

        simpleNums(100);

        System.out.println("\n" + cubs(4, 6));

        System.out.println("fib1: " + fib1(10));

        System.out.println("fib2: " + fib2(10));

        test();
    }

    public static Integer sumOfNums(int num) { // O(1) + O(n) + O(1) + O(1) = O(2+n) = O(n)
        int sum = 0; //O(1)
        for (int i = 1; i <= num; i++) { //O(n)
            sum += i; //O(1)
        }
        return sum; //O(1)
    }

    public static void simpleNums(int num) { // O(n * sqrt(n))
        for (int i = 2; i <= num; i++) { // O(n)
            boolean check = true; // O(1)
            for (int j = 2; j * j <= i; j++) { // O(sqrt(n))
                if (i % j == 0) { // O(1)
                    check = false; // O(1)
                    break; // O(1)
                }
            }
            if (check) // O(1)
                System.out.print(i + "  "); // O(1)
        }
    }

    public static int cubs(int k, int n) {
        return cubs(k, n, 1);


    }

    public static int cubs(int k, int n, int h) { // O(n^k)
        if (h > k)
            return 1;

        int res = 0;
        for (int i = 1; i <= n; i++) { // O(n)
            res += cubs(k, n, h + 1);
        }

        return res;
    }

    public static long fib1(long num) {
        if (num <= 2) return 1;

        return fib1(num - 1) + fib1(num - 2);
    }

    public static long fib2(int num) {

        if (num <= 2) return 1;

        long[] f = new long[num + 1];
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= num; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[num];
    }

    public static void test() {
        for (int i = 10; i <= 50; i++) {
            Date start = new Date();
            fib1(i);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();

            start = new Date();
            fib2(i);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.print("\nfib " + i);
            System.out.print("\ttime1 = " + time1);
            System.out.print("\ttime2 = " + time2);
        }
    }
}