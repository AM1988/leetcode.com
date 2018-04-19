/**
 * Given an input string, reverse the string word by word.
 * <p>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        //create an array with all words
        String[] words = s.split(" ");

        String result = "";

        //add trimmed i value to the result string if it is not empty
        //start adding from the end of the array
        for (int i = words.length - 1; i >= 0; i--) {

            //if value at the i index is empty then skip it
            if (words[i] == "" || words[i] == " " || words[i].isEmpty()) {
                continue;
            } else {
                result += words[i].trim() + " ";

            }
        }

        return result.trim();

    }

    public static void main(String[] args) {
        ReverseWordsInString rws = new ReverseWordsInString();
        System.out.println(rws.reverseWords("atr   a   b "));
    }
}
