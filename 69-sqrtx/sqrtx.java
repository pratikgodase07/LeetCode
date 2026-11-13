class Solution {
    public int mySqrt(int x) {
        // Base cases: square root of 0 is 0, square root of 1 is 1
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Use long to avoid integer overflow when calculating mid * mid
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // Exact square root found
            } else if (square < x) {
                answer = mid;   // Save mid as a valid candidate
                left = mid + 1; // Search the right half for a larger valid root
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return answer;
    }
}