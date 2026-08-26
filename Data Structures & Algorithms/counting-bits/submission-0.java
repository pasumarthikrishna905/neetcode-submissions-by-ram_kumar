class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int temp=i;
            int c=0;
            while(temp>0)
            {
                int res=temp%2;
                if(res==1)
                {
                    c++;
                }
               temp=temp/2;
            }
            a[i]=c;
        }
        return a;
    }
}
