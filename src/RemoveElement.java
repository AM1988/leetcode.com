import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * <p>
 * Given nums = [3,2,2,3], val = 3,
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 */

public class RemoveElement {

    public String removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        ArrayList res = new ArrayList();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != val) {
                res.add(nums[i]);
            }
        }
return res.toString();
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(new int[]{3,2,2, 3}, 3));
    }
}
