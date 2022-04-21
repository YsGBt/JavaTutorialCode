package homework.section9;

public class Min {

  public static double min(double[] array) throws IllegalArgumentException {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("No Elements");
    }
    double min = array[0];
    for (int i = 1; i < array.length; ++i) {
      min = Double.min(min, array[i]);
    }
    return min;
  }
}
