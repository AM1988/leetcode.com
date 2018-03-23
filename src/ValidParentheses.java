/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        while (s.length() != (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()) ;
        return s.isEmpty();


    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("([])"));

    }
}
