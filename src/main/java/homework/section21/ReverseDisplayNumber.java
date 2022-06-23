package homework.section21;

public class ReverseDisplayNumber {

  public static void main(String[] args) {
    reverseDisplayNumber(12345);
  }

  public static void reverseDisplayNumber(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(n % 10);
    reverseDisplayNumber(n / 10);
  }
}
