/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        //to solve this problem we should compare firstIndexOf and lastIndexOf each characters and if they are equal return index of this character
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        //if no such statement return -1
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString re = new FirstUniqueCharacterInAString();
        System.out.println(re.firstUniqChar("loveleetcode"));
        System.out.println(re.firstUniqChar("leetcode"));
    }
}
