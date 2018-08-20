package com.company;

public class Question8 {
  public static void main(String[] args) {
    System.out.println("Write a program to sum the following series:1/3+3/5+5/7+9/11+11/13+...+95/97+97/99");
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
