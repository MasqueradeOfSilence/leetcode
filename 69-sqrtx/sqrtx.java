class Solution 
{
    public int mySqrt(int x) 
    {
        if (x == 0)
        {
            return 0;
        }
        if (x == 1)
        {
            return 1;
        }
        int start = 0;
        int end = x;
        int answer = 0;
        while (start <= end)
        {
            int midpoint = (start + end) / 2;
            long sqrtTest = (long) midpoint * midpoint;;
            if (sqrtTest == x)
            {
                answer = midpoint;
                break;
            }
            if (sqrtTest < x)
            {
                answer = midpoint;
                start = midpoint + 1;
            }
            else
            {
                end = midpoint - 1;
            }
        }
        return answer;
    }
}