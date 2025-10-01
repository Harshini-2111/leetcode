// Last updated: 01/10/2025, 21:21:41
class Solution {
    int[] memo = new int[101];
    public int rob(int[] nums) {
        Arrays.fill(memo, -1);
        return solve(nums, 0);
    }
    private int solve(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        int skipped = solve(nums, index + 1);
        int robbed = nums[index] + solve(nums, index + 2);
        return memo[index] = Math.max(skipped, robbed);
    }
}