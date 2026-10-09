class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
    int a[]=new int[2];
    int n=nums.length;
    int freq[]=new int[n+1];
    for(int i=0;i<n;i++)
    {
        freq[nums[i]]++;
    }
    for(int i=0;i<freq.length;i++)
    {
        if(freq[i]==2)
        a[0]=i;
        else if(freq[i]==0)
        a[1]=i;
    }
    return a;
    }
}