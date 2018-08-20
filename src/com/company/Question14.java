package com.company;

import java.util.Scanner;

public class Question14 {
  public static void main(String[] args) {
    System.out.println("14. Write a method to compute the following series for all I which is an even number:\n"
        + "m(i)= 4(1−1/3+1/5-1/7+1/9-1/11+1/13- ... - 1/2i-1+1/2i+1)");
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter i: ");
    double i = scanner.nextDouble();
    double x =2;
    double modal = 1;
    while (x <= (2*i)){
        modal = modal - (1/(x+1));
      System.out.println(modal);
        modal = modal + (1/(x+3));
        x+=4;
      System.out.println(modal);
    }
    double mi = 4 * modal;
    System.out.println("Result number is "+mi);
  }
}
