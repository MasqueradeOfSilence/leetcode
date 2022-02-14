class Solution 
{
    private boolean isOpenBracket(char c)
    {
        return c == '(' || c == '{' || c == '[';
    }
    
    private boolean isMatch(char a, char b)
    {
        return (a == '(' && b == ')') ||
            (a == '{' && b == '}') || 
            (a == '[' && b == ']');
    }
    
    public boolean isValid(String s) 
    {
        if (s.length() == 1)
        {
            return false;
        }
        ArrayDeque stack = new ArrayDeque();
        for (int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            if (isOpenBracket(current))
            {
                stack.push(current);
            }
            else if (stack.isEmpty())
            {
                return false;
            }
            else
            {
                char top = stack.pop().toString().charAt(0);
                if (!this.isMatch(top, current))
                {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
        {
            return false;
        }
        return true;
    }
}