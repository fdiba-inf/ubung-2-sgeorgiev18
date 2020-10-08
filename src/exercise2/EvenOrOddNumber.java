package exercise2;

import java.util.Scanner;


public class EvenOrOddNumber {

  public static void main(String[] args) {

    System.out.print("Type a number: ");
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();

    int b = (a % 2);

    if (b == 0) {
      System.out.print("Even");
    }
    else if (b > 0) {
      System.out.print("Odd");

    }
    
  }
}