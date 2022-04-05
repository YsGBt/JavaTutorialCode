package homework.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PickCard {

  public static void main(String[] args) {
    Random r = new Random();
    int number = r.nextInt(13) + 1;
    int suit = r.nextInt(4);
    System.out.println(
        "The card you picked is " + CardNumber.of(number) + " of " + CardSuit.of(suit));
  }
}

enum CardNumber {
  ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
  SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11),
  QUEEN(12), KING(13);

  private static final Map<Integer, CardNumber> map = new HashMap<>();

  static {
    for (CardNumber c : CardNumber.values()) map.put(c.value, c);
  }

  private final int value;

  CardNumber(final int value) {
    this.value = value;
  }

  public static CardNumber of(int value) {
    return map.get(value);
  }

  @Override
  public String toString() {
    switch (this.value) {
      case 1:
        return "Ace";
      case 11:
        return "Jack";
      case 12:
        return "Queen";
      case 13:
        return "King";
      default:
        return String.valueOf(this.value);
    }
  }
}

enum CardSuit {
  CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3);

  private static final Map<Integer, CardSuit> map = new HashMap<>();

  static {
    for (CardSuit c : CardSuit.values()) map.put(c.value, c);
  }

  private final int value;

  CardSuit(final int value) {
    this.value = value;
  }

  public static CardSuit of(int value) {
    return map.get(value);
  }

  @Override
  public String toString() {
    switch (this.value) {
      case 0:
        return "Clubs";
      case 1:
        return "Diamonds";
      case 2:
        return "Hearts";
      default:
        return "Spades";
    }
  }
}
