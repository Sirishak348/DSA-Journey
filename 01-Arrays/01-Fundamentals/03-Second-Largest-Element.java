class Solution {
    public int secondLargestElement(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > first) {
                second = first;
                first = nums[i];
            }
            else if(nums[i] != first && nums[i] > second) {
                second = nums[i];
            }
        }

        if(second == Integer.MIN_VALUE)
            return -1;

        return second;
    }
}