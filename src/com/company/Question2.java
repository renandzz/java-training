package com.company;
import java.util.*;
import java.io.*;

public class Question2 {
  public static void main(String[] args) {
    System.out.println("If you know the balance and the annual percentage interest rate, you can compute the interest\n"
        + "on the next monthly payment using the following formula:\n"
        + "interest= balance×(annualInterestRate/1200)\n"
        + "Write a program that reads the balance and the annual percentage interest rate and displays\n"
        + "the interest for the next month in two versions: (a) Use dialog boxes to obtain input and display\n"
        + "output; (b) Use console input and output. A sample run of the console input and output is\n"
        + "shown\n"
        + "below:");
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter Balance: ");
    double balance = scanner.nextDouble();
    System.out.print( "Enter annual interest rate:");
    double rate = scanner.nextDouble();
    double interest = balance * (rate/1200);
    System.out.print( "The interest is "+interest);

  }
}
