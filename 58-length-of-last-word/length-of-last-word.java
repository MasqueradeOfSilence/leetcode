class Solution 
{
    /**
        Algorithm:
            Start at the end of the word. 
            Iterate backwards. 
            Find the first char that you can, and then iterate backwards, counting until it's a space. 
     */
    public int lengthOfLastWord(String s) 
    {
        boolean wordStarted = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            char current = s.charAt(i);
            if (current != ' ')
            {
                wordStarted = true;
                count++;
            }
            if (wordStarted && current == ' ')
            {
                break;
            }
        }
        return count;
    }
}