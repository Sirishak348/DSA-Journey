class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
    int pascal[][]=new int[n+1][n+1];
    ArrayList<List<Integer>> list=new ArrayList<>();
    for(int i=1;i<=n;i++)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        pascal[i][1]=1;
        pascal[i][i]=1;
        temp.add(pascal[i][1]);
        for(int j=2;j<i;j++)
        {
            pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            temp.add(pascal[i][j]);
        }
        if(i>1)
        temp.add(pascal[i][i]);
        list.add(temp);
    }
    return list;
    }
}