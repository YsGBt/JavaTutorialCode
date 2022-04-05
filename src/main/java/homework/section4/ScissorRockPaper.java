package homework.section4;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    int computerChoice = r.nextInt(3);
    int userChoice;
    do {
      System.out.print("scissor(0), rock(1), paper(2): ");
      userChoice = input.nextInt();
    } while (userChoice < 0 || userChoice > 2);

    int result = userChoice - computerChoice;
    if (result == 2 || result == -2) {
      result /= -2;
    }
    System.out.print(
        "The computer is " + findChoice(computerChoice) + ". You are " + findChoice(userChoice));
    if (result == 0) {
      System.out.println(" too. It is a draw");
    } else if (result > 0) {
      System.out.println(". You won");
    } else {
      System.out.println(". You lose");
    }
  }

  private static String findChoice(int choice) {
    switch (choice) {
      case 0:
        return "scissor";
      case 1:
        return "rock";
      default:
        return "paper";
    }
  }
}
