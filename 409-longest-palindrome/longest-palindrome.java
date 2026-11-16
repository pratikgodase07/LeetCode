class Solution {
    public int longestPalindrome(String s) {
        // Array to count occurrences of each ASCII character (both 'A'-'Z' and 'a'-'z')
        int[] charCounts = new int[128];

        // Step 1: Count how many times each character appears in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCounts[currentChar] = charCounts[currentChar] + 1;
        }

        int totalLength = 0;
        boolean hasOddCount = false;

        // Step 2: Check the count of every character
        for (int i = 0; i < charCounts.length; i++) {
            int count = charCounts[i];

            if (count % 2 == 0) {
                // If the count is even, we can use all of those characters in pairs
                totalLength = totalLength + count;
            } else {
                // If the count is odd, use the largest even number of characters (count - 1)
                totalLength = totalLength + (count - 1);
                // Remember that we have at least one leftover character for the center
                hasOddCount = true;
            }
        }

        // Step 3: If there was any leftover single character, put one in the very center
        if (hasOddCount) {
            totalLength = totalLength + 1;
        }

        return totalLength;
    }
}