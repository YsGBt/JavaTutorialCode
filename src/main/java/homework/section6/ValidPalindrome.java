package homework.section6;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    int left = 0;
    int right = 0;
    char[] cs = new char[s.length()];

    for (char c : s.toCharArray()) {
      if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
        cs[right++] = c;
      } else if (c >= 'A' && c <= 'Z') {
        cs[right++] = (char) (c - 'A' + 'a');
      }
    }
    --right;
    while (left < right) {
      if (cs[left++] != cs[right--]) {
        return false;
      }
    }
    return true;
  }
}
