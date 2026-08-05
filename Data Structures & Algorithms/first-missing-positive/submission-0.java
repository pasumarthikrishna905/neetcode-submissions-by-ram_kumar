class Solution {
    public int firstMissingPositive(int[] nums)
    {
       int n=nums.length;
       Arrays.sort(nums);
       int c=1;
       for(int i=0;i<n;i++)
       {
           if(nums[i]==c)
           {
            c=c+1;
           }
           else if(nums[i]<c)
           {
            continue;
           }
           else
           {
            return c;
           }
       } 
       return c;
    }
}