package exercise2;

import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    double Pi = 4.0 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 11.0 - 1.0 / 13.0 + 1.0 / 17.0 - 1.0 / 19.0 + 1.0 / 23);
    double C = (2 * Pi * r);
    double A = (Pi * r * r);
    System.out.print("Circumference: ");
    System.out.println(C);
    System.out.print("Area: ");
    System.out.print(A);

  }
}