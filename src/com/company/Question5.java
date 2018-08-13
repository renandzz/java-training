package com.company;

import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {

    int weight = 1;

    System.out.println("Kilograms   Pound");
    for (int i = 0; i < 100 ; i++) {
      double kg = weight + (i*2);
      double pounds = kg*2.2;
      System.out.println(kg+"   "+pounds);
    }


  }
}
