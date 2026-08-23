class Solution {
    public void rotate(int[][] matrix)
    {
        int n=matrix.length;
        for(int left=0;left<n;left++)
        {
            int i=0;
            int right=n-1;
            while(i<right)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[right][left];
                matrix[right][left]=temp;

                i++;
                right--;
            }

        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp1=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp1;
            }
        }
    }
}
