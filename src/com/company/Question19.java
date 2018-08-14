package com.company;

import java.util.Scanner;

public class Question19 {
  public static void main(String[] args) {
    int[] a = new int[]  {1, 2, 3, 4, 5, 6};
    double[] b = new double[]  {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};

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
