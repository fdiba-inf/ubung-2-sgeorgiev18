package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
    System.out.print("Type a three-digit-nubmer: ");

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();

    int b = (a / 100);

    int c = (a / 10);

    int d = (c % 10);

    int e = (a % 10);

    int f = (b + d + e);
    System.out.print("The sum of the three digits of your number is: ");
    System.out.print(f);

    
  }
}