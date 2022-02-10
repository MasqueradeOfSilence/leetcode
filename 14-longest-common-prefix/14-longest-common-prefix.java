class Solution 
{
    public String longestCommonPrefix(String[] strs)
    {
        StringBuilder prefix = new StringBuilder();
        int index = 0;
        boolean finished = false;
        while (!finished)
        {
            if (strs[0].length() == index)
            {
                finished = true;
                break;
            }
            char first = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++)
            {
                if (strs[i].length() == index)
                {
                    finished = true;
                    break;
                }
                char current = strs[i].charAt(index);
                if (current != first)
                {
                    finished = true;
                    break;
                }
            }
            if (!finished)
            {
                prefix.append(first);
            }
            index++;
        }
        return prefix.toString();
    }
}