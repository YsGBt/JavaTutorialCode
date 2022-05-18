package homework.section16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Generate100IntToFile {

  private final static String FILEPATH = "src/main/java/homework/section16/Exercise12_15.txt";

  public static void main(String[] args) {
    Random r = new Random();
    File file = new File(FILEPATH);
    try (
        PrintWriter writer = new PrintWriter(file);
    ) {
      for (int i = 0; i < 100; ++i) {
        writer.print(r.nextInt());
        writer.print(" ");
      }
    } catch (FileNotFoundException e) {
      System.out.println("Cannot create the file");
      System.exit(1);
    }

    int[] array = new int[100];
    try (
        Scanner input = new Scanner(file);
    ) {
      int i = 0;
      while (input.hasNext()) {
        array[i++] = input.nextInt();
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      System.exit(2);
    }

    Arrays.sort(array);

    try (
        PrintWriter writer = new PrintWriter(file);
    ) {
      for (int n : array) {
        writer.print(n);
        writer.print(" ");
      }
    } catch (FileNotFoundException e) {
      System.out.println("Cannot create the file");
      System.exit(1);
    }
  }
}
