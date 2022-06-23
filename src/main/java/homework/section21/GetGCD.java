package homework.section21;

public class GetGCD {

  public static void main(String[] args) {
    System.out.println(gcd(6, 12));
  }

  public static int gcd(int m, int n) {
    return n == 0 ? m : gcd(n, m % n);
  }
}
