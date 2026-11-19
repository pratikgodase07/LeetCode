class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        String merged = "";
        int i = 0;

        while (i < word1.length() || i < word2.length()) 
        {
            if (i < word1.length()) 
            {
                merged = merged + word1.charAt(i);
            }

            if (i < word2.length()) 
            {
                merged = merged + word2.charAt(i);
            }

            i = i + 1;
        }

        return merged;
    }
}