class Solution {
    public String reverseWords(String s)
    
     {
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++)
         {
            String word = words[i];
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0; j--) 
            {
                reversedWord = reversedWord + word.charAt(j);
            }

            result = result + reversedWord;

            if (i < words.length - 1) 
            {
                result = result + " ";
            }
        }

        return result;
    }
}