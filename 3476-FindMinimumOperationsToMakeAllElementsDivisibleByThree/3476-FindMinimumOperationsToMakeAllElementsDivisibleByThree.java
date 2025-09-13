// Last updated: 13/09/2025, 11:53:46
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        
        for (int num : nums) {
            if (num % 3 != 0) {
                operations++;
            }
        }
        
        return operations;
    }
}
