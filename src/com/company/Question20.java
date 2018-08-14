package com.company;

public class Question20 {
  public static void main(String[] args) {
    int[][] a = new int[][]  {{1,2,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};

    int sum = 0;
    for (int[] arraynya:a
    ) {
      for (int angka: arraynya
      ) {
        sum +=angka;
      }
    }
    System.out.println("Jumlah semuanya : "+sum);
  }

}
