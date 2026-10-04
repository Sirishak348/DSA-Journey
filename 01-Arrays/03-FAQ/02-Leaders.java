class Solution {
    public List<Integer> leaders(int[] nums) {
    ArrayList<Integer> a=new ArrayList<>();
    int n=nums.length;
    a.add(nums[n-1]);
    for(int i=n-1;i>=0;i--)
    {
        int res=0;
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]<=nums[j])
            break;
        }
        if(res==1)
        a.add(nums[i]);
    }
  return a;
    }
}
