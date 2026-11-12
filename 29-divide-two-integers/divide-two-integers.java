class Solution {
    public int divide(int dividend, int divisor) {
        // Special overflow case: -2147483648 / -1 exceeds max int (2147483647)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Check if the final answer should be negative
        boolean isNegative = false;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            isNegative = true;
        }

        // Use long to avoid overflow when converting negative numbers to positive
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int answer = 0;

        // Subtract multiples of divisor using simple addition/doubling
        while (a >= b) {
            long currentDivisor = b;
            int count = 1;

            // Keep doubling currentDivisor until it becomes larger than 'a'
            while (a >= currentDivisor + currentDivisor) {
                currentDivisor = currentDivisor + currentDivisor;
                count = count + count;
            }

            a = a - currentDivisor;
            answer = answer + count;
        }

        if (isNegative) {
            return -answer;
        } else {
            return answer;
        }
    }
}