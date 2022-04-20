package homework.section8;

public class Pentagonals {

  public static void main(String[] args) {
    //q1
    final int NUMBER_OF_PENTAGONALS = 100;
    final int NUMBER_PER_LINE = 10;
    final int FORMAT_LENGTH = 7;
    String pentagonalsFormat = "%" + FORMAT_LENGTH + "d";
    String notationFormat = "%" + (FORMAT_LENGTH * -1 + 1) + "d|";
    System.out.print(" ".repeat(FORMAT_LENGTH));
    for (int i = 1; i <= NUMBER_PER_LINE; ++i) {
      System.out.printf(pentagonalsFormat, i);
    }
    System.out.println("\n" + "-".repeat(FORMAT_LENGTH * NUMBER_PER_LINE + FORMAT_LENGTH));
    System.out.printf(notationFormat, 0);
    for (int i = 1; i <= NUMBER_OF_PENTAGONALS; ++i) {
      if (i % NUMBER_PER_LINE == 0) {
        System.out.printf(pentagonalsFormat + "\n", getPentagonalNumber(i));
        if (i < NUMBER_OF_PENTAGONALS) System.out.printf(notationFormat, i);
      } else {
        System.out.printf(pentagonalsFormat, getPentagonalNumber(i));
      }
    }

  }

  // q1
  public static int getPentagonalNumber(int n) {
    return n * (3 * n - 1) / 2;
  }
}
