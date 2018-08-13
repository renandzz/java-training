package com.company;
import java.util.*;

public class Question9 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double mean;
    double deviation;
    double number;
    mean = 0;
    deviation = 0;

    int[] numbers = new int[10];
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random()*1000 + 1);
    }
    System.out.println("Numbers Generated: " + Arrays.toString(numbers));
    for (int angka:numbers) {
      mean += angka;
      deviation += Math.pow(angka, 2);
    }
    deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
    mean /= 10;

    System.out.println("Mean = " + mean);
    System.out.println("Deviation = "+ deviation);
  }
}
