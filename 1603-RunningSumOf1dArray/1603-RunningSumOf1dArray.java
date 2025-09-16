// Last updated: 16/09/2025, 10:08:41
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum = nums[i] + nums[i - 1];
            nums[i] = sum;
        }
        return nums;
    }
}