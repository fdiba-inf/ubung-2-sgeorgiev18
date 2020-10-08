package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();

    int b = (a / 100);

    int c = (a / 10);

    int d = (c % 10);

    int e = (a % 10);

    int f = (b + d + e);
    System.out.print("Sum of digits: ");
    System.out.print(f);

    
  }
}