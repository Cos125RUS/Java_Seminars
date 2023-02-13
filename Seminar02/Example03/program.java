// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом 
// (возвращает boolean значение).

import java.util.Scanner;


public class program {
  public static void main(String[] args) {
      String line = enterString();
      System.out.println(check(line));
      System.out.println(isPalindrome(line));
  }

  public static String enterString(){
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter: ");
    String userAnswer = userInput.nextLine();
    return userAnswer;
  }

  private static boolean isPalindrome(String st) {
    String st2 = String.valueOf((new StringBuilder(st)).reverse());
    return st.equals(st2);
}

  public static boolean check(String line){
    char[] arr = line.toCharArray();
    int size = arr.length;
    for (int i = 0; i < size / 2; i++){
      if (arr[i] != arr[size - i - 1]){
        return false;
      }
    }

    return true;
  }

}
