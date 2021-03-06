/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean result = word.toUpperCase() == word || word.toLowerCase() == word || (String.valueOf(word.charAt(0)) + word.substring(1).toLowerCase()).equals(word);

        return result;
    }

    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();
        System.out.println(dc.detectCapitalUse("USA"));
        System.out.println(dc.detectCapitalUse("leetcode"));
        System.out.println(dc.detectCapitalUse("Flag"));
        System.out.println(dc.detectCapitalUse("UsA"));
    }
}
