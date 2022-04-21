package homework.section9;

import java.util.Scanner;

public class Gcd {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the five numbers: ");
    int[] numbers = new int[5];
    for (int i = 0; i < 5; ++i) {
      numbers[i] = input.nextInt();
    }
    System.out.println(gcd(numbers));
  }

  public static int gcd(int... numbers) {
    int gcd = 0;
    for (int i = 0; i < numbers.length; ++i) {
      if (numbers[i] == 0) {
        return 0;
      }
      gcd = gcd(numbers[i], gcd);
    }
    return Math.abs(gcd);
  }

  public static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
