class Solution {
    public int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int res = 0;
        int temp = x;

        if (x < 0) {
            temp = -temp;
        }

        while (temp > 0) {
            int res1 = temp % 10;

            // Check before multiplication
            if (res > max / 10 || 
                (res == max / 10 && res1 > 7)) {
                return 0;
            }

            res = res * 10 + res1;
            temp = temp / 10;
        }

        if (x < 0) {
            return -res;
        }

        return res;
    }
}