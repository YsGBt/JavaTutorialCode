package homework.section6;

import java.util.Scanner;

public class Unicode {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String s = input.next();
    char c = s.charAt(0);
    int unicode = c;
    System.out.println("The Unicode for the character " + c + " is " + unicode);
  }
}
