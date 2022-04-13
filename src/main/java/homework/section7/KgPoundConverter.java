package homework.section7;

public class KgPoundConverter {

  public static void main(String[] args) {
    final double POUNDS_PER_KILOGRAM = 2.2;

    // Display table header
    System.out.println(
        "Kilograms    Pounds     |     Pounds      Kilograms");
    for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
      System.out.printf("%-13d%6.1f", k, (k * POUNDS_PER_KILOGRAM));
      System.out.print("     |     ");
      System.out.printf("%-12d%9.2f\n", p, (p / POUNDS_PER_KILOGRAM));
    }
  }
}
