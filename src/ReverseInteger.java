import java.util.Arrays;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output:  321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public int reverse(int x) {
        String num = Integer.toString(x);
        String resultStr = "";
        for (int index = num.length() - 1; index >= 0; index--) {
            resultStr += num.charAt(index);

        }

        if (x < 0) {
            resultStr = "-" + resultStr.substring(0, resultStr.length() - 1);

        }

        if (resultStr.charAt(0) == '0') {
            resultStr = resultStr.substring(1);
        }

        try {
            return Integer.parseInt(resultStr);
        } catch (java.lang.NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        ReverseInteger revInt = new ReverseInteger();
        System.out.println(revInt.reverse(-321));
        System.out.println(revInt.reverse(123));

        System.out.println(revInt.reverse(1211111340));
    }
}
