package homework.section16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLetterAppearance {

  public static void main(String[] args) {
    int[] count = new int[26];
    Scanner sin = new Scanner(System.in);
    System.out.print("Please input the file path: ");
    File file = new File(sin.nextLine());

    try (
        Scanner input = new Scanner(file);
    ) {
      while (input.hasNext()) {
        String cur = input.next().toLowerCase();
        for (char c : cur.toCharArray()) {
          if (c - 'a' > 25 || c - 'a' < 0) continue;
          count[c - 'a']++;
        }
      }

      System.out.printf("%6s%15s\n", "Letter", "Appearance");
      for (int i = 0; i < 26; ++i) {
        System.out.printf("%6c%15d\n", ('a' + i), count[i]);
      }

    } catch (FileNotFoundException e) {
      System.out.println("No such file!");
      System.exit(1);
    }
  }
}
