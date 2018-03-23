import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i <= nums.length -1; i++){
            for (int j = 1; j <= nums.length -1; j++)

                if (nums[i]+nums[j]==target && i!=j){
                    result[0] = i;
                    result[1] = j;

                }
        }
        return result;
    }

    public static void main(String[] args){
        TwoSum test = new TwoSum();
        int [] testArr = new int[] {3,2,3};
        System.out.println(Arrays.toString(test.twoSum(testArr, 6 )));
    }
}