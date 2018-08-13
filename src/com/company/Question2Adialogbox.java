package com.company;

import javax.swing.JOptionPane;


public class Question2Adialogbox {
  public static void main(String[] args) {
    double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance:"));
    double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter annual interest rate:"));
    double interest = balance * (rate/1200);
    JOptionPane.showMessageDialog(null,
        interest);


  }
}
