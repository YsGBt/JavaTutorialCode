package homework.section21;

public class CountCharNum {

  public static void main(String[] args) {
    int count = count("1ask2asdjls3askdj4a", 'a');
    System.out.println(count);
  }

  public static int count(String str, char a) {
    if (str == null || str.length() == 0) {
      return 0;
    }
    if (str.charAt(0) == a) {
      return 1 + count(str.substring(1), a);
    } else {
      return count(str.substring(1), a);
    }
  }
}
