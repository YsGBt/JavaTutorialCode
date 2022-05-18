package homework.section15;

public class OutOfMemoryErrorExample {
  public static void main(String[] args) {
    try {
      int[] n = new int[Integer.MAX_VALUE];
    } catch (OutOfMemoryError e) {
      System.out.println(e.getMessage());
    }
  }
}
