import java.util.ArrayList;

/**
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 * <p>
 * Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
 * Example:
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * Note: The input number n will not exceed 100,000,000. (1e8)
 */
public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> divisors = new ArrayList();
        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i) divisors.add(num / i);
            }
        }
        int resultToCompare = 1;
        for (Integer divisor : divisors
                ) {
            resultToCompare += divisor;

        }

        if (resultToCompare == num) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        PerfectNumber pf = new PerfectNumber();
        System.out.println(pf.checkPerfectNumber(28));
        System.out.println(pf.checkPerfectNumber(999992));
    }
}

