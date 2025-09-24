// Last updated: 24/09/2025, 11:02:59
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            }
            else if (nums[left] + nums[right] > k) {
                right--;
            }
            else {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}