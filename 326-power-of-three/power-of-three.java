class Solution {
    public boolean isPowerOfThree(int n) {
        // Negative numbers and 0 cannot be powers of 3
        if (n <= 0) {
            return false;
        }

        // Keep dividing n by 3 as long as it is divisible by 3
        while (n % 3 == 0) {
            n = n / 3;
        }

        // If n becomes 1, it was a power of 3
        return n == 1;
    }
}