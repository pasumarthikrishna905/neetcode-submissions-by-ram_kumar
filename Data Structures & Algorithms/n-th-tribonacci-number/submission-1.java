class Solution {
    public int tribonacci(int n)
    {
       if(n<2)
       {
        return n;
       } 
       int n1=0,n2=1,n3=1;
       int n4=0;
       for(int i=2;i<n;i++)
       {
          n4=n1+n2+n3;
          n1=n2;
          n2=n3;
          n3=n4;
       }
       return n3;
    }
}