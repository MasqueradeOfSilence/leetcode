class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int numNotEqual = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[numNotEqual] = nums[i];
                numNotEqual++;
            }
        }
        return numNotEqual;
    }
}