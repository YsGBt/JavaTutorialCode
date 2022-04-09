package homework.section6;

import java.util.Random;

public class RandomLetter {

  public static void main(String[] args) {
    char letter = getRandomLetter();
    System.out.println(letter);
  }

  public static char getRandomLetter() {
    Random r = new Random();
    char letter = (char) ('A' + r.nextInt(26));
    return letter;
  }
}
