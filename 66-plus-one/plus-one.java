class Solution 
{
    /**
        Algorithm: 
            Starting from the last digit, 
            If it's 9, change it to 0
            Else, increment by 1, and exit the loop. 

        If we hit position 0 and never hit a non-9 number - for example, incrementing 9 -> 10,
            Create a new array of size digits + 1
            put the 0th position as 1, everything else as 0
     */
    public int[] plusOne(int[] digits) 
    {
        int position = digits.length - 1;    
        while (position > 0)
        {
            int currentDigit = digits[position];
            if (currentDigit == 9)
            {
                digits[position] = 0;
            }
            else
            {
                digits[position]++;
                break;
            }
            position--;
        }
        if (position == 0)
        {
            if (digits[0] != 9)
            {
                digits[0]++;
                return digits;
            }
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            for (int i = 1; i < digits2.length; i++)
            {
                digits2[i] = 0;
            }
            return digits2;
        }
        return digits;
    }
}