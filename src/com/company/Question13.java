package com.company;

import java.util.Scanner;

public class Question13 {
  public static void main(String[] args) {
    System.out.println("13. Write a method that computes future investment value at a given interest rate for a specified\n"
        + "number of years. The future investment is determined using the formula in No. 1. Use the\n"
        + "following method header:\n"
        + "public static double futureInvestmentValue(double investmentAmount, double\n"
        + "monthlyInterestRate, int years)\n"
        + "For example, futureInverstmentValue (10000, 0.05/12, 5) returns 12833.59\n"
        + "Write a test program that prompts the user to enter the investment amount (eg., 1000) and the\n"
        + "interest rate (e.g., 9%), and print a table that displays future value for the years form 1 to 30, as\n"
        + "shown below:");
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter Investment Amount: ");
    double investmentAmount = scanner.nextDouble();

    System.out.print("Enter Annual interest rate: ");
    double monthlyInterestRate = scanner.nextDouble()/12;
    System.out.println("Years      Future Value");
    for (int i = 1; i < 31; i++) {
      System.out.print("  "+i+"     ");
      System.out.println("   "+futureInvestmentValue(investmentAmount,monthlyInterestRate,i));
    }

  }
  public static double futureInvestmentValue(double investmentAmount, double
      monthlyInterestRate, int years){
    double number = (double) Math.pow(1+monthlyInterestRate,(years*12));
    return investmentAmount * number;
  }
}
