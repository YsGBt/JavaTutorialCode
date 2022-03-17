package homework.section3;

import java.util.Scanner;

public class PoundToKg {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number in pounds: ");
    double pound = input.nextDouble();
    double kg = pound * 0.454;
    System.out.println(pound + " pounds is " + kg + " kilograms");
  }
}
