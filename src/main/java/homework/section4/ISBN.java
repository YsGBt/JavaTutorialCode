package homework.section4;

import java.util.Scanner;

public class ISBN {

  // Calculate the 10th digit of ISBN based on the first 9 digits.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int first9Number = input.nextInt();

    int copy = first9Number;
    int lastNumber = 0;
    for (int i = 9; i > 0; --i) {
      lastNumber += (copy % 10) * i;
      copy /= 10;
    }
    lastNumber %= 11;

    if (lastNumber == 10) {
      System.out.println("The ISBN-10 number is " + String.format("%09d", first9Number) + "%");
    } else {
      System.out.println(
          "The ISBN-10 number is " + String.format("%09d", first9Number) + lastNumber);
    }
  }
}
