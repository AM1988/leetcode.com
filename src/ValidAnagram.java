import java.util.ArrayList;
import java.util.Collections;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        //if length of each string is different return false
        if (s.length() != t.length()) {
            return false;
        }

        ArrayList<Character> s1 = new ArrayList<>();
        ArrayList<Character> t1 = new ArrayList<>();
        //add to ArrayList all char from each string
        for (int i = 0; i <= s.length() - 1; i++) {
            s1.add(s.charAt(i));
            t1.add((t.charAt(i)));
        }
        //Sort 2 ArrayList
        Collections.sort(s1);
        Collections.sort(t1);
        //return boolean result
        return s1.equals(t1);

    }

    public static void main(String[] args) {
        ValidAnagram re = new ValidAnagram();
        System.out.println(re.isAnagram("anagram", "nagaram"));
        System.out.println(re.isAnagram("rat", "car"));
    }
}
