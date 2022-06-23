package homework.section21;

public class SumNumDigits {

  public static void main(String[] args) {
    System.out.println(sumDigits(234L));
  }

  public static int sumDigits(long n) {
    if (n == 0) return 0;
    return ((int) (n % 10)) + sumDigits(n / 10);
  }
}
