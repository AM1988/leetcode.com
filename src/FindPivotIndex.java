import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * <p>
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * <p>
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 * <p>
 * Example 1:
 * Input:
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation:
 * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
 * Also, 3 is the first index where this occurs.
 * Example 2:
 * Input:
 * nums = [1, 2, 3]
 * Output: -1
 * Explanation:
 * There is no index that satisfies the conditions in the problem statement.
 * Note:
 * <p>
 * The length of nums will be in the range [0, 10000].
 * Each element nums[i] will be an integer in the range [-1000, 1000].
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        ArrayList copyOfNums = new ArrayList();
        for (Object elem : nums
                ) {
            copyOfNums.add(elem);
        }

        for (int i = 0; i <= copyOfNums.size() - 1; i++) {
            List leftArr = copyOfNums.subList(0, i);
            int leftSum = 0;
            for (int j = 0; j <= leftArr.size() - 1; j++) {
                leftSum += (Integer) leftArr.get(j);

            }

            List rightArr = copyOfNums.subList(i + 1, copyOfNums.size());
            long rightSum = 0;
            for (int j = 0; j <= rightArr.size() - 1; j++) {
                rightSum += (Integer) rightArr.get(j);

            }

            if (leftSum != rightSum) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex pivotIndex = new FindPivotIndex();
        System.out.println(pivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
