package homework.section6;

import java.util.Random;

public class GenerateCarPlate {

  public static void main(String[] args) {
    Random r = new Random();
    char c1 = RandomLetter.getRandomLetter();
    char c2 = RandomLetter.getRandomLetter();
    char c3 = RandomLetter.getRandomLetter();
    String plate =
        "" + c1 + c2 + c3 + r.nextInt(10) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10);
    System.out.println(plate);
  }
}
