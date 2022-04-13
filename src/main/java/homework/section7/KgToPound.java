package homework.section7;

public class KgToPound {

  public static void main(String[] args) {
    final double POUNDS_PER_KILOGRAM = 2.2;

    System.out.println("Kg      Pounds");
    System.out.println("--------------");

    for (int i = 1; i < 100; ++i) {
      System.out.printf("%-8d%-1.1f\n", i, (i * POUNDS_PER_KILOGRAM));
    }
  }
}
