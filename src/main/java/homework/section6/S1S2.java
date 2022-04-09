package homework.section6;

import java.util.Locale;

public class S1S2 {

  public static void main(String[] args) {
    String s1 = "Welcome";
    String s2 = "welcome";
    // a.
    boolean isEqual = s1.equals(s2);
    // b.
    boolean isEqual1 = s1.equalsIgnoreCase(s2);
    // c.
    int x1 = s1.compareTo(s2);
    // d.
    int x2 = s1.compareToIgnoreCase(s2);
    // e.
    boolean b1 = s1.startsWith("AAA");
    // f.
    boolean b2 = s1.endsWith("AAA");
    // g.
    int x3 = s1.length();
    // h.
    char x4 = s1.charAt(0);
    // i.
    String s3 = s1 + s2;
    // j.
    String sub1 = s1.substring(1);
    // k.
    String sub2 = s1.substring(1, 5);
    // l.
    String s1low = s1.toLowerCase();
    // m.
    String s1up = s1.toUpperCase();
    // n.
    String s1trim = s1.trim();
    // o.
    int x5 = s1.indexOf('e');
    // p.
    int x6 = s1.lastIndexOf("abc");
  }
}
