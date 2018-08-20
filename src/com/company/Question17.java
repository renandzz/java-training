package com.company;


public class Question17 {
  public static void main(String[] args) {
    System.out.println("17. Write two overloaded methods that return the average of an array with the following headers:\n"
        + "public static double average(int[] array);\n"
        + "public static double average(double[] array);\n"
        + "Use {1, 2, 3, 4, 5, 6} and {6.0, 4.4, 1.9, 2.9, 3.4, 3.5} to test the methods.");
    int[] a = new int[]  {1, 2, 3, 4, 5, 6};
    double[] b = new double[]  {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};

    System.out.println("mean array a :"+average(a));
    System.out.println("mean array b :"+average(b));

  }
  public static double average(int[] array){
    int sum=0;
    for (int angka:array
    ) {
      sum+= angka;
    }
    int mean = sum / array.length;
    return mean;
  }
  public static double average(double[] array) {
    double sum=0;
    for (double angka:array
        ) {
      sum+= angka;
    }
    double mean = sum / array.length;
    return mean;
  }
}
