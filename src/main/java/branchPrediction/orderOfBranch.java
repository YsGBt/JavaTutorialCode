package branchPrediction;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/*
  Branch Prediction is a very interesting topic, and it could dramatically improve the runtime
performance:
  Sorted   ~40ms
  Shuffle  ~120ms
 */
public class orderOfBranch {

  private final static boolean shuffle = false;
  private final static long top = 10000000;

  public static void main(String[] args) {
    List<Long> numbers = LongStream.range(0, top)
        .boxed()
        .collect(Collectors.toList());

    if (shuffle) {
      Collections.shuffle(numbers);
    }

    long cutoff = top / 2;
    long count = 0;

    long start = System.currentTimeMillis();
    for (Long number : numbers) {
      if (number < cutoff) {
        ++count;
      }
    }
    long end = System.currentTimeMillis();

    System.out.printf("Counted %d/%d %s numbers in %dms",
        count, top, shuffle ? "shuffled" : "sorted", end - start);
  }
}
