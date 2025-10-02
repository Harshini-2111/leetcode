// Last updated: 02/10/2025, 20:11:36
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shifts = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            shifts++;
        }
        int result = left << shifts;
        return result;
    }
}