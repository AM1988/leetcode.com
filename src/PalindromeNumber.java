/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        return (x == reverse(x));
    }


    public int reverse(int x) {
        String num = Integer.toString(x);
        String resultStr = "";
        for (int index = num.length() - 1; index >= 0; index--) {
            resultStr += num.charAt(index);

        }

        if (resultStr.charAt(0) == '0' || resultStr.charAt(0) == '-') {
            resultStr = resultStr.substring(1);
        }

        try {
            return Integer.parseInt(resultStr);
        } catch (java.lang.NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber revInt = new PalindromeNumber();
        System.out.println(revInt.isPalindrome(-2147447412));
        System.out.println(revInt.isPalindrome(-2147483648));
        System.out.println(revInt.isPalindrome(12321));

    }
}

