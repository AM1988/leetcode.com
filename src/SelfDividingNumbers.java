import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 * <p>
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> resultList = new ArrayList();

        for (int num = left; num <= right; num++) {
            String result = Integer.toString(num);
            if (result.indexOf('0') >= 0) {
                continue;
            } else {
                String[] numbers = result.split("");
                boolean check = false;
                for (String str : numbers
                        ) {
                    if (num % Integer.parseInt(str) != 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }

                }
                if (check == true) {
                    resultList.add(num);
                }


            }


        }

        return resultList;
    }

    public static void main(String[] args) {
        SelfDividingNumbers sdn = new SelfDividingNumbers();
        System.out.println(sdn.selfDividingNumbers(1, 23));
    }
}
