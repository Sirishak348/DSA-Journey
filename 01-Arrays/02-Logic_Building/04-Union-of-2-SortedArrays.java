import java.util.*;

class Solution {

    public int[] unionArray(int[] nums1, int[] nums2) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        int[] result = new int[set.size()];

        int index = 0;

        for (int x : set) {
            result[index++] = x;
        }

        return result;
    }
}
