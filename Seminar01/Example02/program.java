// дан массив чисел, нужно сформировать новую выборку
// только из четных чисел
import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // int[] arr = new int[]{11,5,12,8,45,96,54,23,44,2};
        // Scanner myInput = new Scanner(System.in);
        // System.out.println("Введи размер! ");
        // int size = myInput.nextInt();  
        // Random rand = new Random();
        // int randNumber;
        // int[] arr = new int[size];
        // for (int i =0; i < size; i++)
        //     arr[i] = randNumber = rand.nextInt(100);
        // int count = 0;
        // for (int i = 0; i < arr.length; i++)
        //     if ((arr[i] % 2) == 0)
        //         count++;
        // int[] newArr = new int[count];
        // count = 0;
        // for (int i = 0; i < arr.length; i++){
        //     if ((arr[i] % 2) == 0){
        //         newArr[count] = arr[i];
        //         System.out.printf(newArr[count] + " ");
        //         count++;
        //     }
        // }
        int[] arr = createArray();
        printArray(arr);
        int count = count(arr);
        System.out.println();
        System.out.println("===========================================");
        int[] newArr = sortArray(arr, count);
        printArray(newArr);
    }

    static int[] createArray()
    {
        Scanner myInput = new Scanner(System.in);
        System.out.printf("Введи размер! ");
        int size = myInput.nextInt();  
        Random rand = new Random();
        int randNumber;
        int[] arr = new int[size];
        for (int i =0; i < size; i++)
            arr[i] = randNumber = rand.nextInt(100);
        return arr;
    }

    static int count(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if ((arr[i] % 2) == 0)
                count++;
        return count;
    }

    static int[] sortArray(int[] arr, int count)
    {
        int[] newArr = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++){
            if ((arr[i] % 2) == 0){
                newArr[count] = arr[i];
                // System.out.printf(newArr[count] + " ");
                count++;
            }
        }
        return newArr;
    }

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
                System.out.printf(arr[i] + " ");
    }
}
