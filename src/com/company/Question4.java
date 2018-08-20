package com.company;

import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    System.out.println("Write a program that prompts the user to enter an integer and checks whether the number is\n"
        + "divvisible by both 5 and 6, neither, or just one of them. Here are some sample outputs for input\n"
        + "10, 30 and 23.");
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
