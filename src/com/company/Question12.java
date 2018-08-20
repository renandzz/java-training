package com.company;

import java.util.Scanner;

public class Question12 {
  public static void main(String[] args) {
    System.out.println("12. Travel Tickets Company sells tickets for airlines, tours, and other travel-related services.\n"
        + "Because long ticket numbers have often been entered incorrectly by agents, Travel Tickets has\n"
        + "asked you to code a program that will indicate if a ticket number entry is invalid. The program\n"
        + "also should prompt the agent to check the reenter the correct ticket number. Ticket numbers\n"
        + "are 10 to 12 characters long. Ticket numbers are designed so that if you drop the last digit of\n"
        + "the number, then divide the number by 7, the remainder of the division will be identical to the\n"
        + "last dropped digit. This process is illustrated in the following example:\n"
        + "\uF0B7 Step 1 Ticket number 12344321566\n"
        + "\uF0B7 Step 2 Remove last digit, leaving 1234432156\n"
        + "\uF0B7 Step 3 Divide remaining number by 7.1234432156 divide by 7\n"
        + "\uF0B7 Step 4 Remainder of 6 matches the digit dropped from the ticket.\n"
        + "\uF0B7 Step 5 Because the last digit matches the remainder of the division, the ticket number is\n"
        + "valid.");
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
