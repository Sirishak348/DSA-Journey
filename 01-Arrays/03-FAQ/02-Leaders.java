import java.util.*;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = nums.length;
        int max = nums[n - 1];

        list.add(max);

        for(int i = n - 2; i >= 0; i--) {

            if(nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(list);

        return list;
    }
}