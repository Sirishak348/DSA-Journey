class Solution {
    public int findMin(ArrayList<Integer> arr) {
    int n=arr.size();
    int low=0;
    int high=n-1;
    int ans=Integer.MAX_VALUE;
    if(arr.get(low)<=ans)
    ans=arr.get(low);
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr.get(low)<=arr.get(mid))
        {
            ans=Math.min(arr.get(low),ans);
            low=mid+1;
        }
        else
        {
            ans=Math.min(ans,arr.get(mid));
            high=mid-1;
        }
    }
    return ans;
    }
}
