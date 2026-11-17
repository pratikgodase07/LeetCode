import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array from smallest to largest
        Arrays.sort(nums);

        // Because the majority element appears more than n / 2 times,
        // it is guaranteed to occupy the middle index after sorting
        int middleIndex = nums.length / 2;

        return nums[middleIndex];
    }
}