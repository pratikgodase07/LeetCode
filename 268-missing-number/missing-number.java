class Solution {
    public int missingNumber(int[] nums) {
        // Total count of numbers should be from 0 to n
        int n = nums.length;

        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of elements present in the array
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + nums[i];
        }

        // The difference is the missing number
        return expectedSum - actualSum;
    }
}