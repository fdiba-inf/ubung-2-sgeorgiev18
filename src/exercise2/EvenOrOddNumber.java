package exercise2;

import java.util.Scanner;


public class EvenOrOddNumber {

  public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();

    int b = (a % 2);

    if (b == 0) {
      System.out.print("Number is even");
    }
    else if (b > 0) {
      System.out.print("Number is odd");

    }
    
  }
}