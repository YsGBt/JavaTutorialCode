package homework.section5;

import java.util.Scanner;

public class DecToHex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a decimal number: ");
    int num = input.nextInt();
    if (num < 0 || num > 15) {
      System.out.println("Illegal Input");
      return;
    }
    System.out.println("The hex value is " + Integer.toHexString(num));
  }
}
