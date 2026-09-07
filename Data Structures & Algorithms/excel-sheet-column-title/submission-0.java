class Solution {
    public String convertToTitle(int c)
    {
       StringBuffer sb=new StringBuffer();
       while(c>0)
       {
          c--;
          int res=c%26;
          sb.append((char)('A'+res));
          c=c/26;
       }
       return sb.reverse().toString();
    }
}