package com.company;

import java.util.Scanner;

public class Question13 {
  public static void main(String[] args) {
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
