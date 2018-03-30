import java.util.ArrayList;


/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>();
        //if String contains only one word flag equals true
        Boolean isOneWord = (s.indexOf(' ') == -1);

        //add to the Array all words from input String which contains more than 1 word
        while (s.indexOf(' ') > 0 && !isOneWord) {
            words.add(s.substring(0, s.indexOf(' ')));
            s = s.substring(s.indexOf(' ') + 1);
            if (s.indexOf(' ') == -1) {
                words.add(s);
            }
        }
        //build new result string if it contains more than 1 word
        String res = "";
        for (String elem : words
                ) {
            String reverse = new StringBuffer(elem + " ").reverse().toString();
            res += reverse;
        }
        String result = (isOneWord) ? new StringBuffer(s).reverse().toString() : res.trim();
        return result;

    }

    public static void main(String[] args) {
        ReverseWordsinaStringIII re = new ReverseWordsinaStringIII();
        System.out.println(re.reverseWords("Let's take LeetCode contest"));
        System.out.println(re.reverseWords("ABC"));
    }
}

