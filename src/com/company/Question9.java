package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.*;

public class Question9 {
  public static void main(String[] args){
    System.out.println("9. In business applications, you are often asked to compute the mean and standard deviation of\n"
        + "data. The mean is simply the average of the numbers. The standard deviation is a statistic that\n"
        + "tells you how tightly all the various data are clustered around the mean in a set of data. For\n"
        + "example, what is the average age of the students in a class? How close are the ages? If all the\n"
        + "students are the same age, the deviation is 0. Write a program that generates ten random\n"
        + "numbers between 0 and 1000, and computes the mean and standard deviations of these\n"
        + "numbers using the following formula:");
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
