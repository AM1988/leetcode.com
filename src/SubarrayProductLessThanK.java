import java.util.ArrayList;
import java.util.List;

/**
 * Your are given an array of positive integers nums.
 * <p>
 * Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.
 * <p>
 * Example 1:
 * Input: nums = [10, 5, 2, 6], k = 100
 * Output: 8
 * Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
 * Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * Note:
 * <p>
 * 0 < nums.length <= 50000.
 * 0 < nums[i] < 1000.
 * 0 <= k < 10^6.
 */
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        ArrayList intList = new ArrayList<Integer>();

        for (int i : nums) {

            intList.add(i);
        }


        ArrayList<List> sublists = new ArrayList<>();
        for (int i=0;i<=intList.size()-1;i++){
            sublists.add(intList.subList(i,intList.size()));
        }
        System.out.println(sublists.toString());
        int result=0;
        for (int i=0;i<=sublists.size()-1;i++){
            int temp=1;
            for (int j=0; j<=sublists.get(i).size()-1;j++){
                temp*= (Integer) sublists.get(i).get(j);
                if (temp<k ){result++;}
                else if (temp>=k){break;}
            }
        }
        return result;
    }




    public static void main(String[] args) {
        SubarrayProductLessThanK sub = new SubarrayProductLessThanK();
        System.out.println(sub.numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }
}
