/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //trim space for input string
        s = s.trim();
        //define last index of ' '
        int index = s.lastIndexOf(" ");
        //return length of last word
        if (index >= 0 || index == -1) {
            return s.substring(index + 1).length();
        } else return 0;
    }

    public static void main(String[] args) {
        LengthOfLastWord re = new LengthOfLastWord();
        System.out.println(re.lengthOfLastWord("a"));
    }
}
