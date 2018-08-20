package com.company;

import java.util.Scanner;

public class Question19 {
  public static void main(String[] args) {
    System.out.println("19. Create a class named MyTriangle that contains the following two methods:\n"
        + "/** Returns true if the sum of any two sides is greater that the third side. */\n"
        + "public static boolean isValid(double side1, double side2, double side3)\n"
        + "/** Returns the area of the triangle. */\n"
        + "public static double area(double side1, double side2, double side3)\n"
        + "Write a test program that reads three sides for a triangle and computes the area if the input is\n"
        + "valid. Otherwise, it displays that the input is invalid.");

    Scanner scanner = new Scanner( System.in );
    System.out.print("Enter side1: ");
    double side1 = scanner.nextDouble();
    System.out.print("Enter side2: ");
    double side2 = scanner.nextDouble();
    System.out.print("Enter side3: ");
    double side3 = scanner.nextDouble();

    if(isValid(side1,side2,side3)){
      System.out.println("Area computed : "+ area(side1,side2,side3));
    }else{
      System.out.println("The input is invalid");
    }

  }
  public static boolean isValid(double side1, double side2, double side3){
    if ((side1+side2 < side3 ) | (side1+side3 < side2) | (side2+side3 < side1)) {
      return false;
    }else {
      return true;
    }
  }
  public static double area(double side1, double side2, double side3) {
    double s;
    s= (side1+side2+side3)/2;
    double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
  }
}
