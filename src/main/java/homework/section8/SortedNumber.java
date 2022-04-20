package homework.section8;

public class SortedNumber {

  public static void main(String[] args) {
    displaySortedNumbers(15.0, 213.0, 1.0);
  }

  public static void displaySortedNumbers(double num1, double num2, double num3) {
    double temp;
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num1 > num3) {
      temp = num1;
      num1 = num3;
      num3 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    System.out.println(num1 + " " + num2 + " " + num3);
  }
}
