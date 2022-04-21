package homework.section9;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 10 numbers: ");
    int[] nums = new int[10];
    for (int i = 0; i < 10; ++i) {
      nums[i] = input.nextInt();
    }
    int[] reverseNum = reverse(nums);
    System.out.println(Arrays.toString(reverseNum));
  }

  private static int[] reverse(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    while (start < end) {
      int temp = nums[start];
      nums[start++] = nums[end];
      nums[end--] = temp;
    }
    return nums;
  }
}
