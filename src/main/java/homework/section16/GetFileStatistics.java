package homework.section16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetFileStatistics {

  public static void main(String[] args) {
    if (args == null || args.length == 0) {
      System.out.println("Please give file path");
      System.exit(1);
    }
    String filePath = args[0];
    File file = new File(filePath);

    int numLine = 0;
    int numWord = 0;
    int numCharacter = 0;

    try (
        Scanner input = new Scanner(file);
    ) {
      while (input.hasNext()) {
        String curLine = input.nextLine();
        numLine++;
        numCharacter += curLine.length();
        curLine = curLine.trim();
        String[] words = curLine.split("\\s+");
        numWord += words.length;
      }

      System.out.println("Number of Line: " + numLine);
      System.out.println("Number of Word: " + numWord);
      System.out.println("Number of Character: " + numCharacter);
    } catch (FileNotFoundException e) {
      System.out.println("No such file!");
      System.exit(2);
    }

  }
}
