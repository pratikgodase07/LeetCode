class Solution {
    public String convertToTitle(int columnNumber) {
        // Store the final Excel column name
        String title = "";

        // Keep running until there are no digits left to convert
        while (columnNumber > 0) {
            // Adjust by 1 because Excel columns start from 1 (A = 1, Z = 26)
            columnNumber = columnNumber - 1;

            // Get remainder (0 to 25) to find which letter we need
            int remainder = columnNumber % 26;

            // Convert number into uppercase letter ('A' + 0 = 'A', 'A' + 25 = 'Z')
            char currentLetter = (char) ('A' + remainder);

            // Put the new letter in front of the existing title
            title = currentLetter + title;

            // Update columnNumber for the next loop iteration
            columnNumber = columnNumber / 26;
        }

        // Return the completed column title
        return title;
    }
}