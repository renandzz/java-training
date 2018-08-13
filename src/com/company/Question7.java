package com.company;

import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {


    Scanner scanner = new Scanner( System.in );

    System.out.print("Choose Pattern: ");
    int pattern = scanner.nextInt();

    int number = 1;

    switch (pattern){
      case 1:
        for (int i = 0; i < 6 ; i++) {
          for (int j = 0; j < 6 ; j++) {
            System.out.print((j+1)+" ");
          }
          System.out.println();
        }
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
        default:break;
    }




  }
}
