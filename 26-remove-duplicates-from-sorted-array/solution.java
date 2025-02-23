class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int current = nums[i];
            if (k == 0)
            {
                nums[k] = current;
                k++;
                continue;
            }
            int previous = nums[i - 1];
            if (current != previous)
            {
                nums[k] = current;
                k++;
            }
        }
        return k;
    }
}
