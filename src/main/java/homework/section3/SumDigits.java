package homework.section3;

import java.util.Scanner;

public class SumDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();
    while (number > 1000 || number < 0) {
      System.out.print("Enter a number between 0 and 1000: ");
      number = input.nextInt();
    }
    int sumDigit = 0;
    while (number != 0) {
      sumDigit += number % 10;
      number /= 10;
    }
    System.out.println("The sum of the digits is " + sumDigit);
  }
}
