class Solution {
    public boolean isPowerOfFour(int n) {
        // Negative numbers and 0 cannot be powers of 4
        if (n <= 0) {
            return false;
        }

        // Keep dividing n by 4 as long as it is divisible by 4
        while (n % 4 == 0) {
            n = n / 4;
        }

        // If n becomes 1, it was a power of 4
        return n == 1;
    }
}