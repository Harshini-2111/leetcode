// Last updated: 12/09/2025, 19:18:39
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
        
    }
}