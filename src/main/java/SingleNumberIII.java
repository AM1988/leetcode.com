import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> baseline = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : nums
                ) {
            if (!baseline.containsKey(number)) {
                baseline.put(number, 1);
            } else baseline.put(number, baseline.get(number) + 1);

        }


        for (Integer o : baseline.keySet()) {
            if (baseline.get(o).equals(1)) {
                result.add(o);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();


    }

    public static void main(String[] args) {
        SingleNumberIII sn = new SingleNumberIII();
        System.out.println(sn.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
    }
}
