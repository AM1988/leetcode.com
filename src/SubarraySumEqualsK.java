import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        ArrayList intList = new ArrayList<Integer>();
        for (int i : nums) {
            intList.add(i);
        }

        ArrayList<List> sublists = new ArrayList<>();
        for (int i=0;i<=intList.size()-1;i++){
            sublists.add(intList.subList(i,intList.size()));
        }

        int result=0;
        for (int i=0;i<=sublists.size()-1;i++){
            int temp=0;
            for (int j=0; j<=sublists.get(i).size()-1;j++){
                temp+= (Integer) sublists.get(i).get(j);
                if (temp==k && !(temp>k)){result++;}
            }
        }
        return result;

    }

    public static void main(String[] args) {
        SubarraySumEqualsK sub = new SubarraySumEqualsK();
        System.out.println(sub.subarraySum(new int[]{1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5},6));
    }
}
