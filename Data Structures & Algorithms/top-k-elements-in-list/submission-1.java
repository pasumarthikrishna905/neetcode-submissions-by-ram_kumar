class Solution {
    public int[] topKFrequent(int[] nums, int k)
    {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> fr = new ArrayList<>();

        Arrays.sort(nums);

        int c = 1;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i - 1])
            {
                c++;
            }
            else
            {
                li.add(nums[i - 1]);
                fr.add(c);
                c = 1;
            }
        }

        li.add(nums[nums.length - 1]);
        fr.add(c);

        int a[] = new int[k];

        for(int i = 0; i < k; i++)
        {
            int max = 0;

            for(int j = 1; j < fr.size(); j++)
            {
                if(fr.get(j) > fr.get(max))
                {
                    max = j;
                }
            }

            a[i] = li.get(max);

            li.remove(max);
            fr.remove(max);
        }

        return a;
    }
}