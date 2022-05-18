package homework.section15;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayGenerator {
  public static void main(String[] args) {
    int[] array = generateArray(100);
    Scanner input = new Scanner(System.in);
    boolean invalid = true;
    while (invalid) {
      try {
        int n = input.nextInt();
        System.out.println("The number you choose is: " + array[n]);
        invalid = false;
      } catch (InputMismatchException e) {
        System.out.println("Not an integer! Please input an integer");
        input.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Index out of bound! Please make sure to enter a number from 0 - 99");
        input.nextLine();
      }
    }
  }

  private static int[] generateArray(int size) {
    Random r = new Random();
    int[] array = new int[size];
    for (int i = 0; i < size; ++i) {
      array[i] = r.nextInt();
    }
    return array;
  }
}
