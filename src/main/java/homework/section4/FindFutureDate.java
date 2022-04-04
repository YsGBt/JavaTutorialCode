package homework.section4;

import java.util.Scanner;

public class FindFutureDate {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int todayDate, daysElapsed;
    do {
      System.out.print("Enter today's day: ");
      todayDate = input.nextInt();
    } while (todayDate > 6 || todayDate < 0);

    System.out.print("Enter the number of days elapsed since today: ");
    daysElapsed = input.nextInt();

    int futureDay = todayDate + daysElapsed;
    futureDay %= 7;
    if (futureDay < 0) {
      futureDay += 7;
    }

    System.out.println(
        "Today is " + findDate(todayDate) + " and the future day is " + findDate(futureDay));
  }

  private static String findDate(int date) {
    switch (date) {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      default:
        return "Saturday";
    }
  }
}
