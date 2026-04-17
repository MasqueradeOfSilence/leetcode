class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Potential complements MAPPED to indices
        HashMap<Integer, Integer> potentialComplementsToIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int currentNumber = nums[i];
            int complement = target - currentNumber;
            
            if (potentialComplementsToIndices.containsKey(complement))
            {
                // WOW!
                return new int[]{i, potentialComplementsToIndices.get(complement)};
            }
            else
            {
                // Put the currentNumber in there, because we are HOPING THAT it is a complement
                potentialComplementsToIndices.put(currentNumber, i);
            }
        }
        return new int[]{-1, -1};
    }
    /**
    OBJECTIVE
        We have an ARRAY of INTEGERS. In this array, exactly 2 of the numbers will sum to TARGET. 
        Personal guarantee. 
        We just have to find out what they are. 

    BRUTE FORCE APPROACH
        Double-for, comparing every single integer in nums to every other integer. 
        We would need to check if it's the exact same integer (since the constraints of the problem assert that we wouldn't get something like [4, 4, 8, 12]) and IGNORE THAT CASE, since we don't want to compare a number to itself. like lmao who even does that (definitely not me in 2022)
        Then just...compute the sum and compare it to TARGET. if it is equivalent, return the indices of the two numbers, i and j in our double-for. 

    HASH MAP
        The brute force is not acceptable because God hates us for being alive, so we will have to think about how to eliminate redundant calculations. 
        We actually want to store "Potential Complements". 
        What does this mean? 

        Given the array from the example: [2, 7, 11, 15] with a TARGET of 9
        Brute force would just be like "lmao try 2 + 7, then 2 + 11, etc."
        Ew. 
        The more elegant solution says to do: "OK, we have the number 2. What COMPLEMENT would I need to get me to 9? Well, the answer is 7, because 9-2=7. Now, we store that in a hash map."
        The hash map would be: 
            7: 2
        7 is the key, and 2 is the value. Remember that 7 is the complement, that we HOPE exists somewhere else in the array. 
        So we iterate through each number, and see if it EXISTS as a KEY in the hash map. If it does, NICE! Return its VALUE as well as our current i. 

        WOW! 
     */
}