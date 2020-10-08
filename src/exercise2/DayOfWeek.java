package exercise2;

import java.util.Scanner;

public class DayOfWeek {

  public static void main(String[] args) {
    System.out.print("Choose between 1 and 7 for a day of the week: ");

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();

    if (a == 1) {
      System.out.print("Monday");
    }
    if (a == 2) {
      System.out.print("Tuesday");

    }  
    if (a == 3) {
      System.out.print("Wednesday");
    }  
    if (a == 4) {
      System.out.print("Thursday");
    }
    if (a == 5) {
      System.out.print("Friday");
    }
    if (a == 6) {
      System.out.print("Saturday");
    }
    if (a == 7) {
      System.out.print("Sunday");
    }
    else if ( a > 7){
      System.out.print("Invalid day");

    }
    else if ( a < 1) {
      System.out.print("Invalid day");
    }   
    
  }
}