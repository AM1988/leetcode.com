/**
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 * <p>
 * Example 1:
 * Input: "aba"
 * Output: True
 * Example 2:
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 * Note:
 * The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        s =s.toUpperCase();
        StringBuilder reversedStr = new StringBuilder(s);
        boolean result = false;
        if (s.equals(reversedStr.reverse().toString())) {
            return true;
        } else {
            for (int i = 0; i <= s.length()-1; i++) {
                String s1 = s.substring(0, i) + s.substring(i + 1);

                StringBuilder removedChar = new StringBuilder(s1);
                if (s1.equals(removedChar.reverse().toString())) {
                    result = true;
                    break;
                } else {
                    result = false;
                    continue;
                }

            }
        }
        return result;

    }
    public static void main(String[] args) {
        ValidPalindromeII vp = new ValidPalindromeII();
        System.out.println(vp.validPalindrome(""));
        System.out.println(vp.validPalindrome("aba"));
        System.out.println(vp.validPalindrome("abca"));
    }
}
