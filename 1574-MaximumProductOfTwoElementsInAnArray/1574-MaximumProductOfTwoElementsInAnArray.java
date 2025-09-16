// Last updated: 16/09/2025, 10:08:44
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int firstMax = nums[nums.length - 1];
        int secondMax = nums[nums.length - 2];
        int result = (firstMax - 1) * (secondMax - 1);
        return result;
    }
}