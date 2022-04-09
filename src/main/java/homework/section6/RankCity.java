package homework.section6;

import java.util.Arrays;
import java.util.Scanner;

public class RankCity {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] cities = new String[3];
    System.out.print("Enter the first city: ");
    cities[0] = input.nextLine();
    System.out.print("Enter the second city: ");
    cities[1] = input.nextLine();
    System.out.print("Enter the third city: ");
    cities[2] = input.nextLine();

    Arrays.sort(cities);

    System.out.printf("The three cities in alphabetical order are %s %s %s\n", cities[0], cities[1],
        cities[2]);
  }
}
