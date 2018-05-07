import java.util.*;

/**
 * Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,3,2]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [0,1,0,1,0,1,99]
 * Output: 99
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer number : nums
                ) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else result.put(number, result.get(number) + 1);

        }

        for (Integer o : result.keySet()) {
            if (result.get(o).equals(1)) {
                return o;
            }
        }
        return 0;


    }

    public static void main(String[] args) {
        SingleNumberII sn = new SingleNumberII();
        System.out.println(sn.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}
