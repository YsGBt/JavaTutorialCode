package homework.section21;

public class FindLargestNumber {

  public static void main(String[] args) {
    System.out.println(findLargest(new int[]{2, 3, 5, 6, 8, 3, 1, 8, 3}, 0));
  }

  public static int findLargest(int[] arr, int i) {
    if (i == arr.length) {
      return 0;
    }
    return Math.max(arr[i], findLargest(arr, i + 1));
  }
}
