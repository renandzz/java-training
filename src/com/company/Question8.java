package com.company;

public class Question8 {
  public static void main(String[] args) {

    double ganjil = 1;
    double ganjilplus2;
    double tampung=0;

    while (ganjil<98){
      ganjilplus2 = ganjil+2;
      tampung = tampung + (ganjil/ganjilplus2);
      ganjil+=2;
    }
    System.out.println(tampung);
  }
}
