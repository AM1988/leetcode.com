import java.util.Arrays;
import java.util.List;

/**
 * In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.
 * <p>
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.
 * <p>
 * You need to output the sentence after the replacement.
 * <p>
 * Example 1:
 * Input: dict = ["cat", "bat", "rat"]
 * sentence = "the cattle was rattled by the battery"
 * Output: "the cat was rat by the bat"
 * Note:
 * The input will only have lower-case letters.
 * 1 <= dict words number <= 1000
 * 1 <= sentence words number <= 1000
 * 1 <= root length <= 100
 * 1 <= sentence words length <= 1000
 */
public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split(" ");

        String result = "";
        for (String word : words) {
            for (String element : dict) {
                if (word.indexOf(element) == 0) {
                    word = element;
                    break;
                } else {
                    continue;
                }
            }
            result += word + " ";
            continue;
        }

        return result.trim();

    }

    public static void main(String[] args) {
        ReplaceWords rw = new ReplaceWords();
        List test = Arrays.asList("cat", "bat", "rat");
        System.out.println(rw.replaceWords(test, "the cattle was rattled by the battery"));
    }
}
