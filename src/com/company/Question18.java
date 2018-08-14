package com.company;

public class Question18 {
  public static void main(String[] args) {
    int[] a = new int[]  {1,2,4,5,10,100,2,-22};


    System.out.println("smallestn :"+getsmallest(a));


  }
  public static double getsmallest(int[] array){
    int smallest = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < smallest) {
        smallest = array[i];
      }
    }
    return smallest;
  }
}
