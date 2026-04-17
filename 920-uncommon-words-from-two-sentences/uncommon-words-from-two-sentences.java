import java.util.HashMap;
class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        HashMap<String, Integer> countsOfEachWord = new HashMap<>();
        String megaSentence = s1 + " " + s2;
        String[] words = megaSentence.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            String currentWord = words[i];
            if (countsOfEachWord.containsKey(currentWord))
            {
                // Increment that count 
                int oldCount = countsOfEachWord.get(currentWord);
                countsOfEachWord.put(currentWord, oldCount + 1);
            }
            else
            {
                int initialCount = 1;
                countsOfEachWord.put(currentWord, initialCount);
            }
        }
        ArrayList<String> uncommonWords = new ArrayList<>();
        // Next, go through the map, if the count == 1, add it to return set
        for (String word : countsOfEachWord.keySet())
        {
            int count = countsOfEachWord.get(word);
            if (count == 1)
            {
                uncommonWords.add(word);
            }
        }
        String[] array = uncommonWords.toArray(new String[0]);
        return array;
    }
}

/**
    UNDERSTANDING THE PROBLEM
        Given two sentences, we need to find words that exist once in one sentence, BUT not the other one. 
        This implicitly means that it can't exist twice in the same sentence. So given the two sentences "your mom is fatter than your grandma" and "ah yes morbin time", this would be false because the word "your" appears twice -- even though it's not in the second sentence. 

    THE IDEA
        Brute force would say to combine the two sentences into one big array:
        sentence1 = "roses are blue"
        sentence2 = "violets are red"
        ["roses", "are", "blue", "violets", "are", "red"]

        Then, just do a double-for to compare each word, with every single OTHER word.
        If you see it twice, don't add it to the uncommon_words list. Seeing it twice would mean a count of more than 1. 

    BUT BRUTE FORCE IS FOR CHUMPS
        We need to avoid brute force, because the only people who are fine with brute force are sweaty, hairy neckbeards and pretentious hipsters wearing berets and black jackets who call movies "films". 
        The brute force solution is super redundant. For example:
        Iteration 1: Counts roses and sees 1. 
        Iteration 2: Counts are and sees 2. 

        But we could have already known that information from iteration 1. We don't need to look separately every single time. Because as we look for "roses", we also have the info of "are" readily available to us; we just aren't taking advantage of it. 

    HASH MAP 
        All we have to do is: Save the information using only one for loop. 
        We still make the array of the two sentences combined. But we make a hash map with the following: 
        KEY: Word. 
        VALUE: How many times it occurs. 
        So we iterate through: ["roses", "are", "blue", "violets", "are", "red"]
        and store each one as follows: 
        roses: 1
        are: 2
        blue: 1
        violets: 1
        red: 1

        And thus return ["roses", "blue", "violets", "red"].

    WOW! What an interesting challenge this presents. It makes me want to prance through a field of daisies, surrounded by small, fluffy white kittens. Like little clouds. 
 */