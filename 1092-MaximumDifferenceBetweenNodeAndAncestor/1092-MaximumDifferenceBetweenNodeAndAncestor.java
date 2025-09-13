// Last updated: 13/09/2025, 10:35:48
class Solution {
    int maxDiff;
    public int maxAncestorDiff(TreeNode root) {
        maxDiff = 0;
        if (root == null) {
            return maxDiff;
        }
        helper(root, root.val, root.val);
        return maxDiff;
    }
    private void helper(TreeNode root, int curMax, int curMin) {
        if (root != null) {
            int currDiff = Math.max(Math.abs(root.val - curMax), Math.abs(root.val - curMin));
            maxDiff = Math.max(maxDiff, currDiff);
            curMax = Math.max(curMax, root.val);
            curMin = Math.min(curMin, root.val);
            helper(root.left, curMax, curMin);
            helper(root.right, curMax, curMin);
        }
    }

}