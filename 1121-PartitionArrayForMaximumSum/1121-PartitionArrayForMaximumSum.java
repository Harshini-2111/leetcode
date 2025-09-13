// Last updated: 13/09/2025, 10:35:46
class Solution {
    int[] dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return helper(arr, k, 0);
    }
    private int helper(int[] arr, int k, int start) {
        int len = arr.length;
        if (start >= len) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int currMax = 0, ans = 0;
        int end = Math.min(len, start + k);
        for (int i = start; i < end; i++) {
            currMax = Math.max(currMax, arr[i]);
            ans = Math.max(ans, currMax * (i - start + 1) + helper(arr, k, i + 1));
        }
        return dp[start] = ans;
    }
}
