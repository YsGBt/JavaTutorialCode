package homework.section21;

import java.util.Scanner;

public class CountUpperCase {

  public static void main(String[] args) {
    try (
        Scanner input = new Scanner(System.in);
        ) {
      System.out.print("Please input the string: ");
      String str = input.next();
      int count = countUpperCase(str, 0);
      System.out.println("Number of uppercase letter are: " + count);
    }

  }

  public static int countUpperCase(String str, int i) {
    if (i == str.length()) {
      return 0;
    }
    return countUpperCase(str, i + 1) + ((str.charAt(i) >= 65 && str.charAt(i) <= 90) ? 1 : 0);
  }
}
