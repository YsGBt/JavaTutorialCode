package homework.section7;

public class MilesToKM {

  public static void main(String[] args) {
    final double MILES_TO_KM = 1.609;

    System.out.println("Miles   KM");
    System.out.println("----------");

    for (int i = 1; i < 100; ++i) {
      System.out.printf("%-8d%-1.3f\n", i, (i * MILES_TO_KM));
    }
  }
}
