package homework.section16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalSumFromFile {

  public static void main(String[] args) {
    double sum = 0;
    int count = 0;
    System.out.print("Please input the file path: ");
    Scanner scanner = new Scanner(System.in);
    String filePath = scanner.nextLine();
    File file = new File(filePath);
    if (!file.exists()) {
      System.out.println("No such file!");
      System.exit(1);
    }
    scanner.close();

    try (
        Scanner input = new Scanner(file);
        ) {
      while (input.hasNext()) {
        sum += input.nextDouble();
        count++;
      }
      System.out.println("There are " + count + " numbers");
      System.out.printf("The average is: %.2f%n", (sum / count));
    } catch (FileNotFoundException e) {
      System.out.println("No such file!");
      System.exit(1);
    }
  }
}
