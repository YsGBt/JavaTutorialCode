package homework.section9;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the 10 doubles: ");
    double[] numbers = new double[10];
    for (int i = 0; i < 10; ++i) {
      numbers[i] = input.nextDouble();
    }
    System.out.println(Arrays.toString(bubbleSort(numbers)));
  }

  public static double[] bubbleSort(double[] numbers) {
    boolean swapped = true;
    int end = 0;
    while (swapped) {
      swapped = false;
      for (int i = 0; i < numbers.length - 1 - end; ++i) {
        if (numbers[i] > numbers[i + 1]) {
          double temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
          swapped = true;
        }
      }
      ++end;
    }
    return numbers;
  }
}
