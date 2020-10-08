package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    System.out.print("Choose value for a: ");

    Scanner input = new Scanner(System.in);
    double a = input.nextInt();

    System.out.print("Choose value for b: ");

        double b = input.nextInt();

    System.out.print("Choose value for c: ");

       double c = input.nextInt();
       double D = (b * b - 4 * a * c);
       double x = (-c / b);
       double x1 = (-b + Math.sqrt(D)) / (2 * a);
       double x2 = (-b - Math.sqrt(D)) / (2 * a);

       if (a == 0&b == 0&c == 0) {
         System.out.println("Many values");   
       } else {
         if (a == 0&b == 0& c < 0||a == 0&b == 0&c > 0) {
           System.out.println("No values");
         } else {
           if (a == 0&b < 0||a == 0&b > 0) {
             System.out.print("Your result is: ");
             System.out.println(x);
           } else {
             if (a < 0||a > 0) {
               if (D >= 0) {
                 System.out.print("x1 = ");
                 System.out.println(x1);
                 System.out.print("x2 = ");
                 System.out.println(x2);
               } else {
                 System.out.println("Imaginary values");
               }

             }
           }
         }
       }       
       
             
             
     }
     
  }
