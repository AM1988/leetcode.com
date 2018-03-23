import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int result = Arrays.binarySearch(nums, target);

        if (result < 0) {
            ArrayList<Integer> resL = new ArrayList<Integer>();
            for (Integer elem : nums) {
                resL.add(elem);
            }
            resL.add(target);
            Collections.sort(resL);
            return resL.indexOf(target);
        }
        else return result;


    }


    public static void main(String[] args) {
        SearchInsertPosition test = new SearchInsertPosition();
        System.out.println(test.searchInsert(new int[]{1, 3, 5, 6}, 2));

    }
}