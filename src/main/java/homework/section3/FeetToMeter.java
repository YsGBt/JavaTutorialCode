package homework.section3;

import java.util.Scanner;

public class FeetToMeter {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    double feet = input.nextDouble();
    double meter = feet * 0.305;
    System.out.printf("%.2f feet is %.4f meters", feet, meter);
  }
}
