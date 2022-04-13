package homework.section7;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class HighestScore {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Queue<Student> queue = new PriorityQueue<>((x, y) -> (y.getScore() - x.getScore()));
    int score;
    String name;

    while (true) {
      System.out.print("Enter the student name: ");
      name = input.next();
      System.out.printf("Enter %s's score: ", name);
      score = input.nextInt();
      if (score < 0) break;
      queue.offer(new Student(score, name));
    }

    int rank = 1;
    System.out.println();
    System.out.println("Rank    Student    Score");
    System.out.println("------------------------");
    while (!queue.isEmpty()) {
      Student cur = queue.poll();
      System.out.printf("%-8d%-11s%-5d\n", rank++, cur.getName(), cur.getScore());
    }
  }

  private static final class Student {

    private int score;
    private String name;

    Student(int score, String name) {
      this.score = score;
      this.name = name;
    }

    private int getScore() {
      return this.score;
    }

    private String getName() {
      return this.name;
    }
  }
}
