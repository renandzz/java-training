package com.company;
import java.util.*;
import java.io.*;

public class Question2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter Balance: ");
    double balance = scanner.nextDouble();
    System.out.print( "Enter annual interest rate:");
    double rate = scanner.nextDouble();
    double interest = balance * (rate/1200);
    System.out.print( "The interest is "+interest);

  }
}
