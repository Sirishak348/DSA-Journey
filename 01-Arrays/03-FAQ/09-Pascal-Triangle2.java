class Solution {
    public int[] pascalTriangleII(int r) {
    int[][] pascal=new int[r+1][r+1];
    for(int i=1;i<=r;i++)
    {
        pascal[i][1]=1;
        pascal[i][i]=1;
        for(int j=2;j<i;j++)
        {
            pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
        }
    }
    int ans[]=new int[r];
    int index=0;
    for(int i=1;i<=r;i++)
    {
        ans[index]=pascal[r][i];
        index++;
    }
    return ans;
    }
}