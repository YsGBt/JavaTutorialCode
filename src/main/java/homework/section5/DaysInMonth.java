package homework.section5;

import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class DaysInMonth {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    System.out.print("Enter a month: ");
    String month = input.next();
    int monthInt = Month.valueOf(month.toUpperCase()).getValue();
    YearMonth yearMonth = YearMonth.of(year, monthInt);
    System.out.println(month + " " + year + " has " + yearMonth.lengthOfMonth() + " days");
  }
}
