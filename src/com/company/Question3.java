package com.company;

import javax.swing.JOptionPane;

public class Question3 {

public static void main(String[] args) {
  JOptionPane.showMessageDialog(null, "3. Write a program that sorts three integers. The integers are entered from the input dialogs and\n"
      + "stored in variable num1, num2 and num3, respectively. The program sorts the numbers so that\n"
      + "num1 <= num2 <= num3.");
  int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1:"));
  int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2:"));
  int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter num3:"));

  if (num1 > num2){
    int temporary = num1;
    num1 = num2;
    num2= temporary;
  }
  if (num2 > num3){
    int temporary = num2;
    num2 = num3;
    num3= temporary;
  }
  if (num1 > num2){
    int temporary = num1;
    num1 = num2;
    num2= temporary;
  }

  JOptionPane.showMessageDialog(null, num1+" <= "+num2+ " <= "+num3);

}


}
