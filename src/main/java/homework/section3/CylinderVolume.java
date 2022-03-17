package homework.section3;

import java.util.Scanner;

public class CylinderVolume {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = input.nextDouble();
    double len = input.nextDouble();
    double area = radius * radius * Math.PI;
    double volume = area * len;
    System.out.printf("The area is %.2f\n", area);
    System.out.printf("The volume is %.2f\n", volume);
  }
}
