/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        //replace all non-alphanumeric characters with empty strings for input string
        s = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase();

        StringBuilder reversedStr = new StringBuilder(s);

        //compare changed input string with reversed changed input string
        if (s.equals(reversedStr.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(""));
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(vp.isPalindrome("race a car"));
    }
}
