package homework.section6;

import java.util.Scanner;

public class CheckSubString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first String: ");
    String s1 = input.next();
    System.out.print("Enter the second String: ");
    String s2 = input.next();
    boolean isSubString = s1.contains(s2);
    System.out.println(isSubString);
  }
}
