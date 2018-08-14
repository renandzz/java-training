package com.company;

import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter Digit: ");
    long digit = scanner.nextLong();

    int sumdigit = sumDigits(digit);
    System.out.print( "The sumdigit is "+sumdigit);

  }
  public static int sumDigits (long n){
    String convert = Long.toString(n);
    int stringlength = convert.length();
    int sum = 0;

    for (int i = 0; i < stringlength ; i++) {
      sum = sum + Integer.parseInt(Character.toString(convert.charAt(i)));
    }
    return sum;
  }
}
