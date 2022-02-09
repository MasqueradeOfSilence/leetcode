class Solution 
{
    private int symbolToValue(char c)
    {
        switch (c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;       
        }
    }
    
    public int romanToInt(String s) 
    {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (i != s.length() - 1)
            {
                char next = s.charAt(i + 1);
                if (c == 'I' && next == 'V')
                {
                    sum += 4;
                    i++;
                }
                else if (c == 'I' && next == 'X')
                {
                    sum += 9;
                    i++;
                }
                else if (c == 'X' && next == 'L')
                {
                    sum += 40;
                    i++;
                }
                else if (c == 'X' && next == 'C')
                {
                    sum += 90;
                    i++;
                }
                else if (c == 'C' && next == 'D')
                {
                    sum += 400;
                    i++;
                }
                else if (c == 'C' && next == 'M')
                {
                    sum += 900;
                    i++;
                }
                else
                {
                    sum += this.symbolToValue(c);
                }
            }
            else 
            {
                sum += this.symbolToValue(c);   
            }
        }
        return sum;
    }
}