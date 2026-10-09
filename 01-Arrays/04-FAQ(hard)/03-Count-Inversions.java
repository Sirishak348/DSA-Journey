
class Solution {
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergesort(nums, 0, n - 1);
    }

    public static long mergesort(int nums[], int low, int high) {
        long count = 0;

        if (low < high) {
            int mid = low + (high - low) / 2;

            count += mergesort(nums, low, mid);
            count += mergesort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);
        }

        return count;
    }

    public static long merge(int nums[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = nums[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        long count = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
                count += n1 - i;
            }
        }

        while (i < n1) {
            nums[k++] = left[i++];
        }

        while (j < n2) {
            nums[k++] = right[j++];
        }

        return count;
    }
}