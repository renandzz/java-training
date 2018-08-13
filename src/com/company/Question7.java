package com.company;

import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {


    Scanner scanner = new Scanner( System.in );

    System.out.print("Choose Pattern: ");
    int pattern = scanner.nextInt();

    int number = 1;
    int revnumber = 6;

    switch (pattern){
      case 1:
        for (int i = 0; i < 6 ; i++) {
          for (int j = 0; j < number ; j++) {
            System.out.print((j+1)+" ");
          }
          number+=1;
          System.out.println();
        }
        break;
      case 2:
        for (int i = 0; i < 6 ; i++) {
          for (int j = 0; j < revnumber ; j++) {
            System.out.print((j + 1) + " ");
          }
          revnumber -= 1;
          System.out.println();
        }
        break;
      case 3:
        for (int i = 0; i < 6 ; i++) {
          for (int j = 0; j < revnumber ; j++) {
            System.out.print("  ");
          }
          for (int j = 0; j < number ; j++) {
            System.out.print((j+1)+" ");
          }
          revnumber -= 1;
          number+=1;
          System.out.println();
        }
        break;
      case 4:
        for (int i = 0; i < 6 ; i++) {
          for (int j = 0; j < number ; j++) {
            System.out.print("  ");
          }
          for (int j = 0; j < revnumber ; j++) {
            System.out.print((j+1)+" ");
          }
          revnumber -= 1;
          number+=1;
          System.out.println();
        }
        break;
        default:break;
    }




  }
}
