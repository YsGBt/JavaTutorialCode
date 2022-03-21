package branchPrediction;

import java.util.stream.LongStream;

/*
  Separate conditions           ~40ms
  Multiple and single condition ~20ms
 */
public class combiningCondition {

  private final static long TOP = 10000000;
  private final static double FRACTION = 0.5;

  public static void main(String[] args) {
    long[] first = LongStream.range(0, TOP)
        .map(n -> Math.random() < FRACTION ? 0 : n)
        .toArray();
    long[] second = LongStream.range(0, TOP)
        .map(n -> Math.random() < FRACTION ? 0 : n)
        .toArray();

    long count = 0;
    long start = System.currentTimeMillis();
    for (int i = 0; i < TOP; i++) {
//      if (first[i] != 0 && second[i] != 0) {
//        ++count;
//      }
      if (first[i] * second[i] != 0) {
        ++count;
      }
    }
    long end = System.currentTimeMillis();

    System.out.printf("Counted %d/%d numbers in %dms", count, TOP, end - start);
  }
}
