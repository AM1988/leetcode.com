/**
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */

public class ReverseString {
    public String reverseString(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed;

    }

    public static void main(String[] args) {
        ReverseString revInt = new ReverseString();
        System.out.println(revInt.reverseString("hellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffffffffffffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffffffffffffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffffffffffffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffffffffffffff5656yy56u56hdrthrhtghjhellpdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "fffffffffffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffffffffffff5656yy56u56hdrthrhtghjhellpdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "fffffffffff5656yy56u56hdrthrhtghjhellpdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "fffffffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ffff5656yy56u56hdrthrhtghjhellpdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "ff5656yy56u56hdrthrhtghj"));

    }
}
