class Solution {
    public void rotateArray(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    int a[]=new int[n];
    int index=0;
    for(int i=k;i<n;i++)
    {
        a[index]=nums[i];
        index++;
    }
    int index1=0;
    for(int i=index;i<n;i++)
    {
        a[i]=nums[index1];
        index1++;
    }
    for(int i=0;i<n;i++)
    {
        nums[i]=a[i];
    }
    }
}