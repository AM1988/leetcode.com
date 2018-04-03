import java.util.*;


/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        /*
        if (nums.length == 0) {
            return false;
        }

        for (int i = 0; i <= nums.length - 1; i++) {

            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    */
        Set<Integer> check = new HashSet<Integer>();
        for (Integer elem : nums
                ) {
            if (!check.add(elem)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate re = new ContainsDuplicate();
        System.out.println(re.containsDuplicate(new int[]{1, 2, 3}));
        System.out.println(re.containsDuplicate(new int[]{1, 1, 2, 3}));
        System.out.println(re.containsDuplicate(new int[]{0}));
    }
}
