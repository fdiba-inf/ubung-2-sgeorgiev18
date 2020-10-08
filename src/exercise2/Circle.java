package exercise2;

import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    double Pi = (3.14159265359);
    double C = (2 * Pi * r);
    double A = (Pi * r * r);
    System.out.print("Circumference: ");
    System.out.println(C);
    System.out.print("Area: ");
    System.out.print(A);

  }
}