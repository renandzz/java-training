package com.company;

import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    System.out.println("Write a program that displays the following table (note that 1 kilogram is 2.2 pounds);\n"
        + "Kilograms Pounds\n"
        + "1 2.2\n"
        + "3 6.6\n"
        + "… …\n"
        + "197 433.4\n"
        + "199 437.8");
    int weight = 1;

    System.out.println("Kilograms   Pound");
    for (int i = 0; i < 100 ; i++) {
      double kg = weight + (i*2);
      double pounds = kg*2.2;
      System.out.println(kg+"   "+pounds);
    }


  }
}
