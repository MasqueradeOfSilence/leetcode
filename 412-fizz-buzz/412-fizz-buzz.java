class Solution 
{
    private boolean isDivisibleBy3(int n)
    {
        return n % 3 == 0;    
    }
    
    private boolean isDivisibleBy5(int n)
    {
        return n % 5 == 0;
    }
    
    public List<String> fizzBuzz(int n) 
    {
        ArrayList<String> results = new ArrayList<>();
        for (int current = 1; current <= n; current++)
        {
            boolean isDivisibleBy3 = this.isDivisibleBy3(current);
            boolean isDivisibleBy5 = this.isDivisibleBy5(current);
            StringBuilder sb = new StringBuilder();
            if (isDivisibleBy3)
            {
                sb.append("Fizz");
            }
            if (isDivisibleBy5)
            {
                sb.append("Buzz");
            }
            if (!isDivisibleBy3 && !isDivisibleBy5)
            {
                sb.append(current);
            }
            results.add(sb.toString());
        }
        return results;
    }
}