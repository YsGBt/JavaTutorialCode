package homework.section9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterScores {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the scores: ");
    int score = 0;
    int sum = 0;
    List<Integer> scores = new ArrayList<>();
    while (score >= 0) {
      score = input.nextInt();
      if (score < 0) break;
      scores.add(score);
      sum += score;
    }
    int average = sum / scores.size();
    int[] numAverage = filterScore(scores, average);
    System.out.println("Number of students above average is: " + numAverage[0]);
    System.out.println("Number of students below average is: " + numAverage[1]);
  }

  private static int[] filterScore(List<Integer> scores, int average) {
    int[] res = new int[2];
    for (int s : scores) {
      if (s >= average) {
        res[0]++;
      } else {
        res[1]++;
      }
    }
    return res;
  }
}
