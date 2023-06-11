package org.example;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10000000;
        int[] arr = new int[size];
        int[] arr2 = new int[size];
//        Random random = new Random();
        for (int i = 0; i < size; i++) {
//            arr[i] = random.nextInt(1, 100);
            arr[i] = (int) (Math.random() * 100);
            arr2[i] = arr[i];
//            System.out.print(arr[i] + " ");
        }
//        System.out.println();
//        Date start = new Date();
//        shaker(arr);
//        Date end = new Date();
//        long time1 = end.getTime() - start.getTime();
//
//        start = new Date();
        mergeSort(arr2);
//        end = new Date();
//        long time2 = end.getTime() - start.getTime();

//        System.out.println("time1 = " + time1);
//        System.out.println("time2 = " + time2);
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }

        System.out.println(binarySearch(arr2, arr[0]));

    }

    final static int[] buf = new int[10000000];

    public static void shaker(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            for (int j = arr.length - i - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (right == left) return;

        int mid = (right + left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j])
                buf[k++] = arr[i++];
            else
                buf[k++] = arr[j++];
        }
        while (i <= mid) {
            buf[k++] = arr[i++];
        }

        while (j <= right) {
            buf[k++] = arr[j++];
        }

        for (int l = left; l <= right; l++) {
            arr[l] = buf[l];
        }
    }

    public static Integer binarySearch(int[] arr, int value){
        int left = 0;
        int right = arr.length - 1;
        while (right - left > 1){
            int mid = (left + right) / 2;
            if(arr[mid] > value)
                right = mid;
            else left = mid;
        }
        if (arr[left] == value)
            return left;
        else if (arr[right] == value)
            return right;
        else return null;
    }
}