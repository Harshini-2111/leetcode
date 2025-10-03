// Last updated: 03/10/2025, 19:36:47
class Solution {
    public boolean isIsomorphic(String s, String t) {
        return helper(s).equals(helper(t));
    }
    private String helper(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }
            sb.append(Integer.toString(map.get(ch)));
            sb.append("-");
        }
        return sb.toString();
    }
}