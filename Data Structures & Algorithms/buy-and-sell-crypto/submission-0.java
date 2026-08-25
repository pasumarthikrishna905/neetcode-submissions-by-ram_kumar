class Solution {
    public int maxProfit(int[] prices)
    {
       int a[]=new int[prices.length];
       for(int i=0;i<prices.length;i++)
       {
          for(int j=i+1;j<prices.length;j++)
          {
              if(prices[i]<prices[j] && (prices[j]-prices[i]>a[i]))
              {
                 a[i]=prices[j]-prices[i];
              }
          }
       }
       int max=0; 
       for(int i=0;i<a.length;i++)
       {
          if(a[i]>max)
          {
            max=a[i];
          }
       }
       return max;
    }
}
