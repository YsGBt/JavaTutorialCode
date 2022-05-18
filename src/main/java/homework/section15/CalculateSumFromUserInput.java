package homework.section15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateSumFromUserInput {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean inValidInput = true;

    while (inValidInput) {
      try {
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(first + " + " + second + " = " + (first + second));
        inValidInput = false;
      } catch (InputMismatchException e) {
        System.out.println("Please input an integer");
        input.nextLine();
//        throw new IllegalArgumentException("Please input integer", e);
      }
    }
  }

}
