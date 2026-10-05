class Solution {
    public int[] selectionSort(int[] nums) {
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        int min_index=i;
        for(int j=i+1;j<n;j++)
        {
            if(nums[j]<=nums[min_index])
            {
                min_index=j;
            }
        }
        int temp=nums[min_index];
        nums[min_index]=nums[i];
        nums[i]=temp;
    }
    return nums;
    }
}