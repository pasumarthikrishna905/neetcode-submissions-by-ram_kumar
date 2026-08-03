class Solution {
    public boolean validPalindrome(String s)
    {
       int n=0;
       int m=s.length()-1;
       while(n<m)
       {
          if(s.charAt(n)!=s.charAt(m))
          { 
            return ispal(s,n+1,m)||ispal(s,n,m-1); 
          }
          n++;
          m--;
       } 
       return true;
    }
    boolean ispal(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}