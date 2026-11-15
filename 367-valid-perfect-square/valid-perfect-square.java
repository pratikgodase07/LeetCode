class Solution {
    public boolean isPerfectSquare(int num) {
        // 1 is a valid perfect square (1 * 1 = 1)
        if (num == 1) {
            return true;
        }

        // The square root of any number > 1 will not exceed num / 2
        long left = 1;
        long right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true; // Found exact square root
            } else if (square < num) {
                left = mid + 1; // Search in the larger half
            } else {
                right = mid - 1; // Search in the smaller half
            }
        }

        // No integer squared equals num
        return false;
    }
}