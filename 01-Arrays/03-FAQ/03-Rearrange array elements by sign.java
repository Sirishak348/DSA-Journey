class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int positive[] = new int[n / 2];
        int negative[] = new int[n / 2];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                positive[index1] = nums[i];
                index1++;
            } else {
                negative[index2] = nums[i];
                index2++;
            }
        }

        int j = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = positive[j];
                j++;
            } else {
                nums[i] = negative[k];
                k++;
            }
        }

        return nums;
    }
}