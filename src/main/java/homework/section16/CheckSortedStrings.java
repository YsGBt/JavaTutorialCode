package homework.section16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckSortedStrings {

  private final static String FILEPATH = "src/main/java/homework/section16/SortedStrings.txt";

  public static void main(String[] args) {
    File file = new File(FILEPATH);
    if (!file.exists()) {
      System.out.println("No such File!");
      System.exit(1);
    }

    String prev = "";
    try (
        Scanner input = new Scanner(file);
    ) {
      if (input.hasNext()) {
        prev = input.next();
      }
      while (input.hasNext()) {
        String cur = input.next();
        if (prev.compareTo(cur) > 0) {
          System.out.println("The strings are not sorted correctly!");
          System.out.println("The strings " + prev + " and " + cur + " are out of order");
          System.exit(0);
        }
        prev = cur;
      }
      System.out.println("The file is sorted!");
    } catch (FileNotFoundException e) {
      System.out.println("No such File!");
      System.exit(1);
    }
  }
}
