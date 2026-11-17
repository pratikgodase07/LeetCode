class Solution {
    public boolean detectCapitalUse(String word) {
        // Store how many uppercase letters exist in the word
        int capitalCount = 0;

        // Loop through every character in the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // Check if the character is between 'A' and 'Z'
            if (currentChar >= 'A' && currentChar <= 'Z') {
                capitalCount = capitalCount + 1;
            }
        }

        // Case 1: All letters in the word are uppercase (e.g., "USA")
        if (capitalCount == word.length()) {
            return true;
        }

        // Case 2: No letters in the word are uppercase (e.g., "leetcode")
        if (capitalCount == 0) {
            return true;
        }

        // Case 3: Only 1 uppercase letter exists, and it is at index 0 (e.g., "Google")
        if (capitalCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }

        // Otherwise, the capitalization is invalid (e.g., "FlaG" or "gOogle")
        return false;
    }
}