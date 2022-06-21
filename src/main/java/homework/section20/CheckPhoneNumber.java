package homework.section20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("^\\d{11}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("18637866964");
    System.out.println(matcher.find());
  }
}
