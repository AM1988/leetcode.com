import java.util.*;

/**
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 * <p>
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
 * <p>
 * Example:
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= paragraph.length <= 1000.
 * 1 <= banned.length <= 100.
 * 1 <= banned[i].length <= 10.
 * The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)
 * paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * Different words in paragraph are always separated by a space.
 * There are no hyphens or hyphenated words.
 * Words only consist of letters, never apostrophes or other punctuation symbols.
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]","") + " ";
        for (String bannedWord : banned)
        {
            paragraph = paragraph.replace(bannedWord+" ", "");
        }

        String[] words = paragraph.split(" ");

        HashMap<String, Integer> resultHashMap = new HashMap<>();
        int count = 1;
        for (String word : words)
        {
            if (word.isEmpty())
            {
                continue;
            }

            if (!resultHashMap.containsKey(word))
            {
                resultHashMap.put(word, count);
            }
            else
                {
                    resultHashMap.put(word,resultHashMap.get(word) + 1);
                }
        }

        int maxValue = Collections.max(resultHashMap.values());
        String resultStr= null;
        for(Map.Entry<String, Integer> x: resultHashMap.entrySet())
        {
            if(x.getValue() == maxValue)
            {
                maxValue= x.getValue();
                resultStr= x.getKey();
            }
        }
        return resultStr;

    }

    public static void main(String[] args) {
        MostCommonWord mcw = new MostCommonWord();
        System.out.println(mcw.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"})); //ball
        System.out.println(mcw.mostCommonWord("Bob. hIt, baLl", new String[]{"hit","bob"})); //ball
        System.out.println(mcw.mostCommonWord("abc abc? abcd the jeff!", new String[]{"abc","abcd","jeff"})); //the
    }
}
