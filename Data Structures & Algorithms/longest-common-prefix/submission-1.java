class Solution {
    public String longestCommonPrefix(String[] strs)
    {
       List<String> li=new ArrayList<>();
       String first=strs[0];
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<first.length();i++)
       {
           char ch=first.charAt(i);
           for(int j=1;j<strs.length;j++)
           {
               if(i>=strs[j].length()||strs[j].charAt(i)!=ch)
               {
                  return sb.toString();
               }
           }
           sb.append(ch);
       } 
       return sb.toString();
    }
}