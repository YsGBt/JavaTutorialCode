package homework.section4;

import java.util.Scanner;

public class PalindromeNumber {

  // Check if the given number is a palindrome.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int inputNum = input.nextInt();
    int number = inputNum;
    int halfNumber = 0;
    while (halfNumber < number) {
      halfNumber = halfNumber * 10 + number % 10;
      number /= 10;
    }
    System.out.println(
        inputNum + " is " + ((number == halfNumber || number == halfNumber / 10) ? "" : "not ")
            + "a palindrome.");
  }
}
