class Solution 
{
    private boolean isEven(int n)
    {
        return n % 2 == 0;
    }
    public boolean isPalindrome(int x) 
    {
        String str = Integer.toString(x);
        if (str.contains("-"))
        {
            return false;
        }
        if (str.length() == 1)
        {
            return true;
        }
        if (!isEven(str.length()))
        {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(str.length() / 2);
            str = sb.toString();
        }
        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2, str.length());
        StringBuilder sb = new StringBuilder();
        sb.append(secondHalf);
        sb.reverse();
        String reversedSecondHalf = sb.toString();
        return reversedSecondHalf.equals(firstHalf);
    }
}