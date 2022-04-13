package homework.section7;

import java.util.Scanner;

public class TuitionFee {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the current tuition fee: ");
    double fee = input.nextDouble();
    System.out.print("Enter the annual increase rate: ");
    double ai = input.nextDouble();

    System.out.println("The tuition fee after 10 year is: " + fee * Math.pow(ai, 10));
  }
}
