class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
    for(int j=0;j<=n;j++)
    {
    int res=0;
    for(int i=0;i<n;i++)
    {
      if(nums[i]==j)
      {
      res=1;
      break;
      }
    }
    if(res==0)
    return j;
    }
    return -1;
    }
}