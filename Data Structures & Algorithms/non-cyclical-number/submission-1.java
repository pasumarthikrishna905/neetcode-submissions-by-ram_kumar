class Solution {
    public boolean isHappy(int n)
    {
        int temp=n;
       while(temp!=1 && temp!=4)
       {
          int sum1=0;
          while(temp>0)
          {
            int res=temp%10;
            sum1+=res*res;
            temp=temp/10;
          }
          temp=sum1;
       } 
       return temp==1;
    }
}
