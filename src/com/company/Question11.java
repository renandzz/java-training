package com.company;

import java.util.Scanner;

public class Question11 {
  public static void main(String[] args) {
    System.out.println("11. Write the following method to return an integer reversed:\n"
        + "public static int reverse(int number)\n"
        + "For example, reverse(3456) returns 6543");
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter Digit: ");
    int digit = scanner.nextInt();

    int reversed = reverse(digit);
    System.out.print( "The reversed is "+reversed);

  }
  public static int reverse(int number){
    String convert = Long.toString(number);
    int stringlength = convert.length();
    int sum = 0;
    String temp = "";
    for (int i = 0; i < stringlength ; i++) {
      temp = temp + Character.toString(convert.charAt(stringlength-1-i));
    }
    return Integer.parseInt(temp);
  }
}


OK
