package com.company;

public class Question1 {

  public static void main(String[] args) {
    // write your code here
    int investmentAmount = 1000;
    double monthlyInvestmentRate = 3.25/100/12;
    int numberOfYears = 1;
    double number = (double) Math.pow(1+monthlyInvestmentRate,(numberOfYears*12));
    double futureInvestmentValue = investmentAmount * number;
    System.out.println(futureInvestmentValue);
  }
}
