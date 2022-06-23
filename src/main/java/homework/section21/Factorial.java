package homework.section21;

import java.math.BigInteger;

public class Factorial {


  public static void main(String[] args) {
    System.out.println(factorial(100));
  }

  public static BigInteger factorial(int n) {
    if (n == 0) {
      return new BigInteger("1");
    }
    return new BigInteger(n + "").multiply(factorial(n - 1));
  }

}
