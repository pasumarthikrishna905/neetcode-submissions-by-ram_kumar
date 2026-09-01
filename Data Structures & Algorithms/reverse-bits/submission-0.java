class Solution {
    public int reverseBits(int n)
    {
        int n1=0;
        for(int i=0;i<32;i++)
        {
            int res=n&1;
            n1=(n1<<1)|res;
            n=n>>>1;
        }
        return n1;
    }
}
