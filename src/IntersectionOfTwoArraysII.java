import java.util.ArrayList;
import java.util.Collections;


/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length >= nums2.length)
        {
            ArrayList<Integer> lst1 = new ArrayList<>();
            for (int element : nums1)
            {
                lst1.add(element);

            }
            Collections.sort(lst1);


            ArrayList<Integer> lst2 = new ArrayList<>();
            for (int element : nums2)
            {
                if (lst1.contains(element))
                {
                    lst2.add(element);
                    lst1.remove(lst1.indexOf(element));
                    Collections.sort(lst2);
                }

            }

            int[] resultArr = new int[lst2.size()];
            int i = 0;
            for (Integer element : lst2)
            {
                resultArr[i++] = element;
            }

            return resultArr;
        }
        else
            {
            ArrayList<Integer> lst1 = new ArrayList<>();
            for (int element : nums2)
            {
                lst1.add(element);

            }
            Collections.sort(lst1);


            ArrayList<Integer> lst2 = new ArrayList<>();
            for (int element : nums1)
            {
                if (lst1.contains(element))
                {
                    lst2.add(element);
                    lst1.remove(lst1.indexOf(element));
                    Collections.sort(lst2);
                }

            }

            int[] resultArr = new int[lst2.size()];
            int i = 0;
            for (Integer element : lst2)
            {
                resultArr[i++] = element;
            }

            return resultArr;
        }


    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII twoArr = new IntersectionOfTwoArraysII();
        System.out.println(twoArr.intersect(new int[]{1, 2}, new int[]{1, 1}));

    }
}
