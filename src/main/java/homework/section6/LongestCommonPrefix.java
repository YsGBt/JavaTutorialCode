package homework.section6;

public class LongestCommonPrefix {

  public String getLongestCommonPrefix(String[] strs) {
    String pre = strs[0];

    for (int i = 1; i < strs.length; ++i) {
      while (strs[i].indexOf(pre) != 0) {
        pre = pre.substring(0, pre.length() - 1);
      }
    }

    return pre;
  }
}
