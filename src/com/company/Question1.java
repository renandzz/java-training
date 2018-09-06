package com.company;

public class Question1 {

  public static void main(String[] args) {
    // write your code here
    System.out.println("1. Write a program that reads in investment amount, annual interest rate, and number of years,\n"
        + "and display the future investment value using the following formula:\n"
        + "numberOfYears futureInvestmentValue=investmentAmount +monthlyInvestmentRate\n"
        + "For example, if you entered amount 1000, annual interest rate 3.25%, and number of years 1,\n"
        + "the future investment value is 1032.98");
    int investmentAmount = 1000;
    double monthlyInvestmentRate = 3.25/100/12;
    int numberOfYears = 1;
    double number = (double) Math.pow(1+monthlyInvestmentRate,(numberOfYears*12));
    double futureInvestmentValue = investmentAmount * number;
    System.out.println(futureInvestmentValue);
  }
}
 sudah benar, coba untuk meningkatakan kwalitas ... kalau  kita mengolah data berupa currency atau  uang pada real project harus menggunakan jenis data Bigdecimal.
