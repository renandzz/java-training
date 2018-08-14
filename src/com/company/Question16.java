package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    Scanner scanner = new Scanner( System.in );

    for(int i = 0; i < numbers.length; i++) {
      System.out.println("Enter number "+(i+1)+":");
      numbers[i] =  scanner.nextInt();
    }
    System.out.println("Numbers Inputted: " + Arrays.toString(numbers));
    System.out.print("Numbers Reversed Order: ");
    for(int i = numbers.length-1; i >= 0; i--) {
      System.out.print(numbers[i]+ " ");
    }



  }

}
