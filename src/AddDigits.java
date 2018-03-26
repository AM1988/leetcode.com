/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

public class AddDigits {
    public int addDigits(int num) {
        //convert entered num value to the string
        String result = Integer.toString(num);

        //result can be one digit from 1 to 9
        while (result.length() > 1) {

            int sum = 0;
            //convert to the Integer every symbol for result string and add it to the sum
            for (int i = 0; i <= result.length() - 1; i++) {
                sum += Integer.parseInt(result.substring(i, i + 1));
            }
            //convert sum value to the result string
            result = Integer.toString(sum);

        }
        return Integer.parseInt(result);

    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(57));
    }

}
