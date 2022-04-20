package homework.section8;

public class Reverse {

  public static void main(String[] args) {
    System.out.println(reverse(456));
    System.out.println(isPalindrome(456));
    System.out.println(isPalindrome(12321));
  }

  public static int reverse(int number) {
    int res = 0;
    while (number > 0) {
      res = res * 10 + number % 10;
      number /= 10;
    }
    return res;
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }
}
