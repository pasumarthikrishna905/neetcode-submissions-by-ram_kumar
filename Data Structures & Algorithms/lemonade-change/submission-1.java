class Solution {
    public boolean lemonadeChange(int[] bills)
    {
        int five=0,ten=0,twenty=0;
        for(int i=0;i<bills.length;i++)
        {
            int temp=bills[i];
            if(temp==5)
            {
                five++;
            }
            else if(temp==10)
            {
                ten++;
                if(five<=0)
                {
                    return false;
                }
                five--;
            }
            else
            {
               twenty++;
               if(ten>0 && five>0)
               {
                  five--;
                  ten--;
               }
               else if(five>=3)
               {
                  five-=3;
               }
               else
               return false;

            }

        }
        return true;
    }
}