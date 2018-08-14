package com.company;

import java.util.Scanner;

public class Question12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter ticket number: ");
    long digit = scanner.nextLong();

    boolean check = checkdigit(digit);
    System.out.print( "The ticket number is "+check);

  }
  public static boolean checkdigit(long number){
    String convert = Long.toString(number);
    int stringlength = convert.length();
    int lastchar = Integer.parseInt(Character.toString(convert.charAt(stringlength-1)));
    int nolastdigit = Integer.parseInt(convert.substring(0,stringlength-1));
    int dividen = nolastdigit%7;
    if (dividen == lastchar) {
      return true;
    }else{
      return false;
    }
  }
}
