class Solution {
    public int addDigits(int num) {
        // Keep looping as long as num has more than one digit (10 or greater)
        while (num >= 10) {
            int sum = 0;

            // Add all individual digits of the current number
            while (num > 0) {
                int lastDigit = num % 10; // Get the rightmost digit
                sum = sum + lastDigit;    // Add it to sum
                num = num / 10;           // Remove the rightmost digit
            }

            // Update num with the new sum and repeat if needed
            num = sum;
        }

        // Return the final single-digit answer
        return num;
    }
}