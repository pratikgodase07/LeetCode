import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        // Store the three rows of a standard QWERTY keyboard in lowercase
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        // List to store valid words that use only one keyboard row
        List<String> validWords = new ArrayList<>();

        // Check each word in the input array one by one
        for (int i = 0; i < words.length; i++) {
            String originalWord = words[i];
            String lowerWord = originalWord.toLowerCase();

            // Find which row the first character belongs to
            char firstChar = lowerWord.charAt(0);
            String targetRow = "";

            if (row1.indexOf(firstChar) != -1) {
                targetRow = row1;
            } else if (row2.indexOf(firstChar) != -1) {
                targetRow = row2;
            } else {
                targetRow = row3;
            }

            // Check if all remaining characters belong to the same targetRow
            boolean isValid = true;
            for (int j = 1; j < lowerWord.length(); j++) {
                char currentChar = lowerWord.charAt(j);

                // indexOf returns -1 if the character is not found in targetRow
                if (targetRow.indexOf(currentChar) == -1) {
                    isValid = false;
                    break;
                }
            }

            // Add the original word (preserving uppercase/lowercase) if all letters matched
            if (isValid) {
                validWords.add(originalWord);
            }
        }

        // Convert the ArrayList back to a regular String array
        String[] result = new String[validWords.size()];
        for (int i = 0; i < validWords.size(); i++) {
            result[i] = validWords.get(i);
        }

        return result;
    }
}