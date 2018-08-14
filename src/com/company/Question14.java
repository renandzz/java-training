package com.company;

import java.util.Scanner;

public class Question14 {
  public static void main(String[] args) {
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
