package homework.section7;

import java.util.Scanner;

public class Average {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numPos = 0;
    int numNeg = 0;
    double average = 0;

    System.out.print("Enter an integer, the input ends if it is 0: ");
    int num = input.nextInt();

    if (num == 0) {
      System.out.println("No numbers are entered except 0");
      return;
    }

    while (num != 0) {
      if (num > 0) {
        ++numPos;
      } else {
        ++numNeg;
      }
      average += num;
      System.out.printf("Current sum is: %.0f, the input ends if it is 0: ", average);
      num = input.nextInt();
    }

    average /= (numNeg + numPos);

    System.out.printf(
        "The number of positive is %d, the number of negative is %d, the average is %.2f", numPos,
        numNeg, average);

  }
}
