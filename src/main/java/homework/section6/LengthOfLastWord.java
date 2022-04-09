package homework.section6;

public class LengthOfLastWord {

  public int getLengthOfLastWord(String s) {
    String[] words = s.split(" ");
    return words[words.length - 1].length();
  }
}
