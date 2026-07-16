class Solution {
    public boolean isPalindrome(String s)
    {
        
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                s1 += ch;
            }
        }
        int low=0;
        int high=s1.length()-1;
        while(low<=high)
        {
            if(s1.charAt(low)!=s1.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
