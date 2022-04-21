package homework.section9;

public class Average {

  public static int average(int[] array) {
    int sum = 0;
    for (int n : array) {
      sum += n;
    }
    return sum / array.length;
  }

  public static double average(double[] array) {
    double sum = 0;
    for (double d : array) {
      sum += d;
    }
    return sum / array.length;
  }
}
