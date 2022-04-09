package homework.section6;

public class LongestPalindromic {

  public String longestPalindrome(String s) {
    int curLen = 0;
    int start = -1;
    char[] cArray = s.toCharArray();

    for (int i = 0; i < cArray.length; i++) {
      if (isPalindrome(cArray, i - curLen - 1, i)) {
        start = i - curLen - 1;
        curLen += 2;
      } else if (isPalindrome(cArray, i - curLen, i)) {
        start = i - curLen;
        curLen += 1;
      }
    }

    return new String(cArray, start, curLen);
  }

  public boolean isPalindrome(char[] c, int start, int end) {
    if (start < 0) {
      return false;
    }

    while (start < end) {
      if (c[start++] != c[end--]) {
        return false;
      }
    }

    return true;
  }
}
