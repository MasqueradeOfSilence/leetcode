class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        for (int i = 0; i < haystack.length(); i++)
        {
            boolean examining = false;
            if (haystack.charAt(i) == needle.charAt(0))
            {
                examining = true;
                int current = i + 1;
                for (int j = 1; j < needle.length(); j++)
                {
                    if (current >= haystack.length())
                    {
                        examining = false;
                        break;
                    }
                    if (haystack.charAt(current) != needle.charAt(j))
                    {
                        examining = false;
                        break;
                    }
                    current++;
                }
                if (examining)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}