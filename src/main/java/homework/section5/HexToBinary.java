package homework.section5;

import java.util.Scanner;

public class HexToBinary {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a hex digit: ");
    String hex = input.next();
    int num = Integer.parseInt(hex, 16);
    System.out.println("The binary value is " + Integer.toBinaryString(num));
  }
}
