class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
    int n=nums.size();
    int low=0;
    int high=n-1;
    int ans=Integer.MAX_VALUE;
    int index=-1;
    if(nums.get(low)<ans)
    {
    ans=nums.get(low);
    index=low;
    }
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(nums.get(low)<=nums.get(mid))
        {
            if(ans>nums.get(low))
            {
            index=low;
            ans=nums.get(low);
            }
            low=mid+1;
        }
        else
        {
            if(nums.get(mid)<ans)
            {
            index=mid;
            ans=nums.get(mid);
            }
             high=mid-1;
        }
    }
return index;
    }
}