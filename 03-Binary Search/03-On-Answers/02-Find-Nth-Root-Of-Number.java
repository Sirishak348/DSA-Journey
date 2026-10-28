class Solution {
    public int NthRoot(int N, int M) {
    int low=1;
    int high=M;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(midna(mid,N,M)==1)
        return mid;
        else if(midna(mid,N,M)==2)
        high=mid-1;
        else
        low=mid+1;
    }  
    return-1;
    }
    public static int midna(int mid,int n,int m)
    {
        long ans=1;
        for(int i=1;i<=n;i++)
        {
           ans=ans*mid;
           if(ans>m)
           return 2;
        }
        if(ans==m)
        return 1;
        else
        return 0;
    }
}
