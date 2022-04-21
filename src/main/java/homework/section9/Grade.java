package homework.section9;

import java.util.Scanner;

public class Grade {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int numStudent = input.nextInt();
    int[] scores = new int[numStudent];
    int best = 0;
    System.out.print("Enter " + numStudent + " scores: ");
    for (int i = 0; i < numStudent; ++i) {
      scores[i] = input.nextInt();
      best = Math.max(best, scores[i]);
    }
    char[] grades = grade(scores, best);
    for (int i = 0; i < numStudent; ++i) {
      System.out.printf("Student %2d scores is %3d and grade is %C\n", i, scores[i], grades[i]);
    }
  }

  private static char[] grade(int[] scores, int best) {
    char[] grades = new char[scores.length];
    for (int i = 0; i < scores.length; ++i) {
      if (scores[i] >= best - 10) {
        grades[i] = 'A';
      } else if (scores[i] >= best - 20) {
        grades[i] = 'B';
      } else if (scores[i] >= best - 30) {
        grades[i] = 'C';
      } else if (scores[i] >= best - 40) {
        grades[i] = 'D';
      } else {
        grades[i] = 'F';
      }
    }
    return grades;
  }
}
