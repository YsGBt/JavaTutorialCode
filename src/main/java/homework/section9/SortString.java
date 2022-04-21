package homework.section9;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.next();
    System.out.println(sort(s));
  }

  public static String sort(String s) {
    char[] cs = s.toCharArray();
    Arrays.sort(cs);
    return new String(cs);
  }

}
