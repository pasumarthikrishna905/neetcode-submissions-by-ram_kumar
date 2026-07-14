class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int num1[]=new int[nums.length];
        int n=nums.length;
        int sum=1;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
            if(i!=j)
            {
                sum*=nums[j];
            }
          }
          num1[i]=sum;
          sum=1;
        }
        return num1;
    }
}  
