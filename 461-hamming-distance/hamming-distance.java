class Solution {
    public int hammingDistance(int x, int y) {
        // Store the count of positions where the bits are different
        int differentBits = 0;

        // Keep checking binary digits from right to left until both numbers become 0
        while (x > 0 || y > 0) {
            // Get the last binary digit (0 or 1) of both x and y
            int bitX = x % 2;
            int bitY = y % 2;

            // If the two bits do not match, increase our counter
            if (bitX != bitY) {
                differentBits = differentBits + 1;
            }

            // Divide by 2 to drop the last binary digit and move to the next one
            x = x / 2;
            y = y / 2;
        }

        return differentBits;
    }
}