package com.company;

import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    String tempName;
    String highestname= "No Student";
    int highestscore= 0;
    int tempscore;

    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter number of student: ");
    int counter = scanner.nextInt();
    Scanner namescanner = new Scanner( System.in );

    for (int i = 0; i < counter ; i++) {
      System.out.print("Enter name of student "+(i+1)+" : ");
      tempName = namescanner.nextLine();
      System.out.print("Enter score of student "+(i+1)+" : ");
      tempscore = scanner.nextInt();

      if(tempscore>highestscore){
          highestscore = tempscore;
          highestname = tempName;
      }
    }

    System.out.print("Student with highest score is "+highestname);

  }
}
