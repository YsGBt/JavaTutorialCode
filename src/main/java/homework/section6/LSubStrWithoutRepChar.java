package homework.section6;

public class LSubStrWithoutRepChar {

  public int lengthOfLongestSubstring(String s) {
    int[] position = new int[127];
    int res = 0;
    int start = 0;
    for (int i = 0; i < s.length(); ++i) {
      char cur = s.charAt(i);
      start = Math.max(start, position[cur]);
      position[cur] = i + 1;
      res = Math.max(res, i - start + 1);
    }
    return res;
  }
}
