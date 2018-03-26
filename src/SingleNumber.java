import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> resultSet = new HashMap<Integer, Integer>();
        String res = "";
        for (int i = 0; i <= nums.length - 1; i++) {
            //check if result set contains key and increase value if so
            if (resultSet.containsKey(nums[i]))
                resultSet.put(nums[i], resultSet.get(nums[i]) + 1);
            else
                resultSet.put(nums[i], 1);
        }
        for (Object o : resultSet.keySet()) {
            if (resultSet.get(o).equals(1)) {
                res = o.toString();
            }
        }
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {
        SingleNumber snglNum = new SingleNumber();
        System.out.println(snglNum.singleNumber(new int[]{3, 2, 2, 1, 1, 1, 1, 1, 3, 3, 3, 3, 2, 2, 2, 2, 4, 3, 1}));
    }
}

