package homework.section4;

import java.util.Scanner;

public class RankNumber {

  // Rank the three input numbers from low to high.
  public static void main(String[] args) {
    int[] list = rankThree();
    System.out.println("The rank is: " + list[0] + ", " + list[1] + ", " + list[2]);
  }

  public static int[] rankThree() {
    Scanner input = new Scanner(System.in);
    int one, two, three;
    System.out.print("Please input the first number: ");
    one = input.nextInt();
    System.out.print("Please input the second number: ");
    two = input.nextInt();
    System.out.print("Please input the third number: ");
    three = input.nextInt();

    if (one > two) {
      int temp = one;
      one = two;
      two = temp;
    }
    if (one > three) {
      int temp = one;
      one = three;
      three = temp;
    }
    if (two > three) {
      int temp = two;
      two = three;
      three = temp;
    }
    return new int[]{one, two, three};
  }
}
