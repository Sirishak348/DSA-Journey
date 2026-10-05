class Solution {

    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        insertion(nums, n);
        return nums;
    }

    public static void insertion(int[] nums, int n) {

        if (n <= 1) {
            return;
        }

        insertion(nums, n - 1);

        int key = nums[n - 1];
        int j = n - 2;

        while (j >= 0 && nums[j] > key) {
            nums[j + 1] = nums[j];
            j--;
        }

        nums[j + 1] = key;
    }
}