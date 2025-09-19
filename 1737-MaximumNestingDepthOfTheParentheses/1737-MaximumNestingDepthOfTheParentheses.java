// Last updated: 19/09/2025, 17:17:49
class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int openBrackets = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openBrackets++;
            } 
            else if (ch == ')') {
                openBrackets--;
            }
            max = Math.max(max, openBrackets);
        }
        return max;
    }
}