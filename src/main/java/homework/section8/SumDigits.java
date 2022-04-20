package homework.section8;

public class SumDigits {

  public static void main(String[] args) {
    System.out.println(sumDigits(324));
  }

  public static int sumDigits(long n) {
    int res = 0;
    while (n > 0) {
      res += n % 10;
      n /= 10;
    }
    return res;
  }
}
