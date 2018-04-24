import java.util.*;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int element : nums1) {
            set1.add(element);

        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int element : nums2) {
            if (set1.contains(element)) {
                set2.add(element);
            }

        }

        int[] resultArr = new int[set2.size()];
        int i = 0;
        for (Integer element : set2)
        {
            resultArr[i++] = element;
        }

        return resultArr;


    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays twoArr = new IntersectionOfTwoArrays();
        System.out.println(twoArr.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}
