class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
    int n=nums.length;
    int low=0;
    int high=n-1;
    int ans1=-1;
        while(low<=high)
        {
       int mid=low+(high-low)/2;
        if(nums[mid]<=x)
        {
          ans1=mid;
          low=mid+1;
        }
        else
        high=mid-1;
        }
        low=0;
        high=n-1;
        int ans2=-1;
        while(low<=high)
        {
        int mid=low+(high-low)/2;
        if(nums[mid]>=x)
        {
          ans2=mid;
          high=mid-1;
        }
        else
        {
            low=mid+1;
        }
        }
     int floor=ans1==-1?-1:nums[ans1];
     int ceil=ans2==-1?-1:nums[ans2];
     return new int[]{floor,ceil};
    }
}