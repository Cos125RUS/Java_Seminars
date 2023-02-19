import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    static int count = 0;
    static List<String> arrList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String com = new String();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        res(a, b, com);
        int[][] arr = counting();
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(arr[i][0] + " " + arr[i][1]);
        int length = len(arr);
//        int[][] newArr = strikeout(arr, length);
        System.out.println(length);
    }

    static int len(int [][] arr){
        System.out.println(arr.length);
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            boolean flag = true;
            for (int j = 0; j < arr.length ; j++){

                if (i==j) break;
                else if (arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1]){
                    flag = false;
//                    System.out.println(arr[i][0] + " " + arr[i][1]);
                }
            }
            if (flag) count++;
        }
        return count;
    }

    static int[][] strikeout(int [][] arr, int length){
        int[][] newArr = new int[length][2];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1])
                    break;
                }
            newArr[count][0] = arr[i][0];
            newArr[count][1] = arr[i][1];
        }
        return newArr;
    }

    static int[][] counting(){
        int[][] arr = new int[count][2];
        int i = 0;
        for (String item: arrList) {
            int k1 = 0, k2 = 0;
            char[] line = item.toCharArray();
            for (int j = 1; j < line.length; j+=2){
                if (line[j] == '1') k1++;
                else k2++;
            }
            arr[i][0] = k1;
            arr[i][1] = k2;
            i++;
//            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
//        System.out.println("res = " + count);
        return arr;
    }

    static void res(int a, int b, String com) {
        if (a == b) {
            count++;
//            System.out.println(com);
            arrList.add(com);
        }
        else
            if (a < b){
                res(k1(a), b, com.concat("k1"));
                res(k2(a), b, com.concat("k2"));
            }
    }


    static int k1(int value) {
        return value * 2;
    }

    static int k2(int value) {
        return value + 1;
    }
}
