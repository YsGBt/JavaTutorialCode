package homework.section21;

public class ReverseDisplayString {

  public static void main(String[] args) {
    reverseDisplay("abcd");
  }

  public static void reverseDisplay(String string) {
    display(string, string.length() - 1);
  }

  public static void display(String str, int i) {
    if (i >= 0) {
      System.out.print(str.charAt(i));
      display(str, i - 1);
    }
  }
}
