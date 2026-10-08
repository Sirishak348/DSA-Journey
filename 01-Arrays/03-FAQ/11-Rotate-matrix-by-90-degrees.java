class Solution {
    public void rotateMatrix(int[][] matrix) {
    int n=matrix.length;
    int a[][]=new int[n][n];
    int index=0;
    for(int i=n-1;i>=0;i--)
    {
      for(int j=0;j<n;j++)
      {
        a[j][index]=matrix[i][j];
      }
      index++;
    }
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
        matrix[i][j]=a[i][j];
    }
    }
    }
}
    