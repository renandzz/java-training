package com.company;

import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter Integer: ");
    int number = scanner.nextInt();

    if ((number%5)==0 & (number%6)==0) {
      System.out.print( number+" is divisible by both 5 and 6 ");
    }else if ((number%5)==0 | (number%6)==0) {
      System.out.print( number+" is divisible by 5 or 6, but not both  ");
    }else{
      System.out.print( number+" is not divisible by either 5 or 6  ");
    }
  }
}
