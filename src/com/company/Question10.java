package com.company;

import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    System.out.println("10. Write a method that computes the sum of the digits in an integer. Use the following method\n"
        + "header: public static int sumDigits (long n)\n"
        + "For example, sumDigits(234) returns 2 + 3 + 4 = 9");
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


OK
