package com.company;

import java.util.Arrays;

public class Question15 {
  public static void main(String[] args){
    double mean;

    mean = 0;

    int[] numbers = new int[10];
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random()*1000 + 1);
    }
    System.out.println("Numbers Generated: " + Arrays.toString(numbers));
    for (int angka:numbers) {
      mean += angka;
    }

    mean /= 10;
    int aboveaveragetracker=0;
    for (int angka:numbers) {
      if(angka > mean){
        aboveaveragetracker+=1;
      }
    }

    System.out.println("Mean = " + mean);
    System.out.println("Number above average = "+aboveaveragetracker);
  }
}
